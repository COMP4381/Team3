package com.example.demo;

import java.util.ArrayList;

import javax.imageio.ImageIO;

import marvin.gui.MarvinImagePanel; 
import marvin.image.MarvinImage; 
import marvin.image.MarvinImageMask; 
import marvin.io.MarvinImageIO; 
import marvin.plugin.MarvinImagePlugin; 
import marvin.util.MarvinPluginLoader;

import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.apache.http.impl.client.DefaultHttpClient;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.fileUpload;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@RequestMapping("/api/palscan")
@RestController
public class PALScanProController {
	
	private static DefaultHttpClient httpClient = null;

	ScannnedImage i = new ScannnedImage();

	@ApiResponse(code = 200, message = "request handled successfully")
	@ApiOperation(value = "get scanned image ", notes = "This get scaned image", response = ArrayList.class)
	@RequestMapping(method = RequestMethod.GET, value = "/scan")
	public String getScanImage() throws IOException {

		BufferedImage img = ImageIO.read(new File(
				"C:\\Users\\Israa Hamed\\Desktop\\Israa Hamed\\PALScanPro\\src\\main\\java\\com\\example\\demo\\Reemas.jpg"));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(img, "jpg", baos);
		baos.flush();
		Base64 base = new Base64(false);
		String encodedImage = base.encodeToString(baos.toByteArray());
		baos.close();
		encodedImage = java.net.URLEncoder.encode(encodedImage, "ISO-8859-1");
		i.setId(1);
		i.setUrl("https://console.cloud.google.com/storage/browser/bucket95/Reemas.jpg");
		i.setImage("Reemas");
		i.setGoogQuality(true);
		new ResponseEntity<String>("Image is SCANNED", HttpStatus.OK);
		return encodedImage;
	}

	@ApiOperation(value = "getQOImage", notes = "Check if it has a good Q", response = ArrayList.class)
	@RequestMapping(method = RequestMethod.GET, value = "/quality/{id}")
	public boolean isGoodQ(@PathVariable int id) {
		return i.isGoogQuality();
	}

	@ApiOperation(value = "uploadScannedImage", notes = "THis operation for uplaod scanned image with its data", response = ArrayList.class)
	@RequestMapping(method = RequestMethod.POST, value = "/upload")
	public ResponseEntity<ScannnedImage> uploadScannedImage() throws ParseException, IOException, JSONException {

		String url = "https://www.googleapis.com/upload/storage/v1/b/bucket95/o?uploadType=multipart&name=Reemas";
		String Body = "Authorization: Bearer ya29.GltxBohzS0OkecGL5VEbnkU2EYILUOWs"
				+ "SjO6MF-w4TYCRVwMrFN4JF-n3B4RUzCRe7JQzv9dLit0o9G7d2EsesZdBUSrOFlHHX0-j_yjoA86R2GoGPg6zzgS7Xfc\r\n"
				+ "Content-Type: multipart/related; boundary=foo_bar_baz\r\n" + "--foo_bar_baz\r\n"
				+ "Content-Type: image/jpeg\r\n" + "" + getScanImage() + "\r\n" + "--foo_bar_baz--";
		if (i.isGoogQuality()) {
			HttpReturnData getRes = CommonHttp.postAPI(url, Body);
			getNameplace("", "");

			return new ResponseEntity<ScannnedImage>(i, HttpStatus.OK);

		} else
			return new ResponseEntity<ScannnedImage>(HttpStatus.NOT_ACCEPTABLE);
	}

	@ApiOperation(value = "get lat & lng", notes = "THis operation for where is scanned image taken ", response = ArrayList.class)
	@RequestMapping(method = RequestMethod.POST, value = "/coordinate")
	public String getplace() throws ParseException, IOException, JSONException {

		String url = "https://www.googleapis.com/geolocation/v1/geolocate?key=AIzaSyBCk5D_vU9I3wOvoUn38JrQzk0F7TMpem0";
		HttpReturnData getRes = CommonHttp.getAPI(url);
		JSONObject resDetail = new JSONObject(getRes.getReturnContent());
		getNameplace(resDetail.getJSONObject("location").getString("lat"),
				resDetail.getJSONObject("location").getString("lng"));
		return i.getPlace();
	}

	@ApiOperation(value = "getLocation", notes = "THis operation for where is scanned image taken ", response = ArrayList.class)
	@RequestMapping(method = RequestMethod.GET, value = "/place")
	public ResponseEntity<String> getNameplace(String lat, String lng)
			throws ParseException, IOException, JSONException {
	
		String latlng = lat + "," + lng;
		String url = "https://maps.googleapis.com/maps/api/geocode/json?latlng=" + latlng
				+ "&key=AIzaSyBCk5D_vU9I3wOvoUn38JrQzk0F7TMpem0";
		HttpReturnData getRes = CommonHttp.getAPI(url);
		JSONObject resDetail = new JSONObject(getRes.getReturnContent());
		System.out.println(resDetail.toString());
		i.setPlace(resDetail.getJSONArray("results").getJSONObject(0).getString("formatted_address"));
		return new ResponseEntity<String>(i.getPlace(), HttpStatus.OK);
	}

	@ApiOperation(value = "DeletescannedImage", notes = "THis operation for delete scanned image", response = ArrayList.class)
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	public ResponseEntity<String> deleteScannedImage(@PathVariable int id) {
		if (i != null) {
			i = null;
			return new ResponseEntity<String>("deleting is done", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("is already deleted", HttpStatus.NOT_ACCEPTABLE);
		}
	}	
	
	@ApiOperation(value = "Filter scanned Image", notes = "THis operation for enhance scanned image", response = ArrayList.class)
	@RequestMapping(method = RequestMethod.POST, value = "/filter/{id}")
	public ResponseEntity<String> filterScannedImage(@PathVariable MarvinImagePlugin     imagePlugin) {
	     MarvinImage   image = MarvinImageIO.loadImage("C:\\Users\\Israa Hamed\\Desktop\\Reemas.jpg"); 
		 imagePlugin = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.color.invert.jar"); 
         imagePlugin.process(image, image);
		return new ResponseEntity<String>("Filter is added", HttpStatus.OK);
	}

}
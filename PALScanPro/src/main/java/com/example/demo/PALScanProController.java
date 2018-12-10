package com.example.demo;

import java.util.ArrayList;

import org.apache.http.ParseException;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
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

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@RequestMapping("/api/palscan")
@RestController
public class PALScanProController {
	ScannnedImage i = new ScannnedImage();

	@ApiOperation(value = "getImage", notes = "This get scaned image", response = ArrayList.class)
	@RequestMapping(method = RequestMethod.GET, value = "/scan")
	public Image getScanImage() {
		/*
		 * if(i.isGoogQuality) { getFilter(i); }else { getScanImage(); }
		 */
		return i.getImage();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/filter")
	public int getFilter(@RequestParam ScannnedImage i) {
		return i.getFilteid();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/upload")
	public ResponseEntity<Object> uploadScannedImage() {

		// Create a bucket
		Credentials credentials = null;
		try {
			credentials = GoogleCredentials.fromStream(new FileInputStream("path/to/file"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Storage storage = StorageOptions.newBuilder().setCredentials(credentials)
				.setProjectId("school-1526403526763").build().getService();
		String bucketName = "my_unique_bucket1"; // Change this to something unique
		Bucket bucket = storage.create(BucketInfo.of(bucketName));
		// Upload a blob to the newly created bucket
		BlobId blobId = BlobId.of(bucketName, "blob1");
		BlobInfo blobInfo = BlobInfo.newBuilder(blobId)
				.setContentType("C:\\Users\\Israa Hamed\\Desktop\\Reemas.jpg").build();
		Blob blob = storage.create(blobInfo, "a simple blob".getBytes(UTF_8));
		return new ResponseEntity<Object>("is uploaded", HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/place")
	public String getplace(@RequestParam (value="location" ,defaultValue="")String location) throws ParseException, IOException, JSONException {
		ArrayList<ScannnedImage> placeImage=new ArrayList<ScannnedImage>();
		String url="";
		HttpReturnData getRes=CommonHttp.getAPI(url);
		JSONObject resDetail =new JSONObject(getRes.getReturnContent());
		
		for (int i = 0; i < resDetail.getJSONArray("results").length(); i++) {
			ScannnedImage si=new ScannnedImage();
			
			si.setPlace(resDetail.getJSONArray("results").getJSONObject(i).getString("vicinity"));
			placeImage.add(si);
		}
		return i.getPlace();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "" + "/delete")
	public String deleteScannedImage(@RequestParam javafx.scene.image.Image i) {
		return "Image Deleted";
	}
}

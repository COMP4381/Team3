
package com.example.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javafx.scene.image.Image;
public class ScannnedImage {
 int id;
 String url,place,image;
 
 boolean googQuality;

 ScannnedImage(){
	 
 }

public ScannnedImage(int id, String url, String place, boolean googQuality, String image) {
	super();
	this.id = id;
	this.url = url;
	this.place = place;
	this.googQuality = googQuality;
	this.image = image;
}

@ApiModelProperty(position=1, required=true)
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}



@ApiModelProperty(position=2, required=true)
public String getUrl() {
	return url;
}


public void setUrl(String url) {
	this.url = url;
}

@ApiModelProperty(position=3, required=true)
public String getPlace() {
	return place;
}


public void setPlace(String place) {
	this.place = place;
}
@ApiModelProperty(position=4, required=true)
public boolean isGoogQuality() {
	return googQuality;
}


public void setGoogQuality(boolean googQuality) {
	this.googQuality = googQuality;
}
@ApiModelProperty(position=4, required=true)
public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}
 

}

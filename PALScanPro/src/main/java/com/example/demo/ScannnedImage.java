
package com.example.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javafx.scene.image.Image;
public class ScannnedImage {
 int id,filteid;
 String url,place;
 boolean googQuality;
 Image image;
  
 ScannnedImage(){
	 
 }

public ScannnedImage(int id, int filteid, String url, String place, boolean googQuality, Image image) {
	super();
	this.id = id;
	this.filteid = filteid;
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
public int getFilteid() {
	return filteid;
}

public void setFilteid(int filteid) {
	this.filteid = filteid;
}

@ApiModelProperty(position=3, required=true)
public String getUrl() {
	return url;
}


public void setUrl(String url) {
	this.url = url;
}

@ApiModelProperty(position=4, required=true)
public String getPlace() {
	return place;
}


public void setPlace(String place) {
	this.place = place;
}
@ApiModelProperty(position=5, required=true)
public boolean isGoogQuality() {
	return googQuality;
}


public void setGoogQuality(boolean googQuality) {
	this.googQuality = googQuality;
}
@ApiModelProperty(position=6, required=true)
public Image getImage() {
	return image;
}

public void setImage(Image image) {
	this.image = image;
}
 

}

*Web Services Course (COMP4382) >> Project Final Repoert >> Team 3 : Nagham Jawabra 1150309 || Israa Hamed 1153216*

# PALScan service for cultural heritage protection   


# Motivation
A service used to protect cultural heritage through scan and upload valuable media to a cloud server !

> What is the problem domain ?

Our Problem domain is Archiving and Crowdsourcing data collecting

>What is the specific SOA-based solution ?

IT-motivated solution for cultural protection that enables people themselves to document and preserve cultural documents, photos, audio, etc …

>Why use service computing?
 
Cheaper solution,because the already used tools in the archiving process is very expensive. Reusability because we will use it in our grad project, and Availability.

# Service Design 
## SOA Diagram 


![soa](https://user-images.githubusercontent.com/36053501/50541484-9e07bb80-0baf-11e9-860b-f61a33ed914c.png)

#### *Explaination in detail:*

Service Provider is Google. and we tested our API through “Advanced REST client. We use Spring Boot to implement our Service, and as for services are :  

We have Composite Service Called : Palscan Service  

We use Different Atomic services which are : Google places , scan service , filter service, Google cloud datastore  

And the 3rd party services we use are :Google places,Google cloud datastore


> ![image](https://user-images.githubusercontent.com/36053501/50541522-44ec5780-0bb0-11e9-8ea3-d4ac5c61b768.png)


## BPMN Diagram


![picture3](https://user-images.githubusercontent.com/36053501/50541256-4e72c100-0baa-11e9-91c0-3262a0a73e83.jpg)


# Implementation Details
We impelemented our services using the RESTful service development paradigm. Which is based on the HTTP protocol which is an RPC-based synchronous communication protocol.And our Data representation is JSON.

## Composite Service Algorithm According to BPMN 2.0

### **filterScannedImageUsingPOST**

Filter scanned Image

THis operation for enhance scanned image

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PalScanProControllerApi;


PalScanProControllerApi apiInstance = new PalScanProControllerApi();
String imagePlugin = "imagePlugin_example"; // String | imagePlugin
try {
    List<Object> result = apiInstance.filterScannedImageUsingPOST(imagePlugin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalScanProControllerApi#filterScannedImageUsingPOST");
    e.printStackTrace();
}
```
### **getNameplaceUsingGET**

getLocation

THis operation for where is scanned image taken 

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PalScanProControllerApi;


PalScanProControllerApi apiInstance = new PalScanProControllerApi();
String lat = "lat_example"; // String | lat
String lng = "lng_example"; // String | lng
try {
    List<Object> result = apiInstance.getNameplaceUsingGET(lat, lng);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalScanProControllerApi#getNameplaceUsingGET");
    e.printStackTrace();
}
```
### **getScanImageUsingGET**

get scanned image 

This get scaned image

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PalScanProControllerApi;


PalScanProControllerApi apiInstance = new PalScanProControllerApi();
try {
    List<Object> result = apiInstance.getScanImageUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalScanProControllerApi#getScanImageUsingGET");
    e.printStackTrace();
}
```
### **getplaceUsingPOST**

get lat &amp; lng

THis operation for where is scanned image taken 

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PalScanProControllerApi;


PalScanProControllerApi apiInstance = new PalScanProControllerApi();
try {
    List<Object> result = apiInstance.getplaceUsingPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalScanProControllerApi#getplaceUsingPOST");
    e.printStackTrace();
}
```

### **uploadScannedImageUsingPOST**

uploadScannedImage

THis operation for uplaod scanned image with its data

```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PalScanProControllerApi;


PalScanProControllerApi apiInstance = new PalScanProControllerApi();
try {
    List<Object> result = apiInstance.uploadScannedImageUsingPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalScanProControllerApi#uploadScannedImageUsingPOST");
    e.printStackTrace();
}
```



## Applied Technologies

development environment: eclipse  <br/>
programming languages : java (JDK 8)<br/>
frameworks and libraries : swagger 2.0, Spring boot<br/>
deployment platforms (PaaS): Google App Engine (GAE), which is a Google Cloud Platform(GCP) service provided by Google<br/>
application server: Apache Tomcat<br/>

> ![image](https://user-images.githubusercontent.com/36053501/50541416-343ae200-0bae-11e9-8926-1e9c04020e54.png)
 

# Service Deployment and Monitoring
## Log file

[Our log File](https://github.com/COMP4381/Team3/blob/master/Team3Log.csv)

[You can view log file for our project here](https://console.cloud.google.com/logs/viewer?project=palscanpro&minLogLevel=0&expandAll=false&timestamp=2018-12-30T12:53:24.256000000Z&customFacets=&limitCustomFacetWidth=true&interval=PT1H&resource=gae_app%2Fmodule_id%2Fdefault&dateRangeUnbound=both&angularJsUrl=%2Flogs%2Fviewer%3Fproject%3Dpsyched-throne-217920%26folder%26organizationId%26minLogLevel%3D0%26expandAll%3Dfalse%26timestamp%3D2018-12-30T12:52:45.517000000Z%26customFacets%3D%26limitCustomFacetWidth%3Dtrue%26dateRangeStart%3D2018-12-30T11:52:37.865Z%26interval%3DPT1H%26resource%3Daudited_resource%26dateRangeUnbound%3DforwardInTime&authuser=1&organizationId=1003645834774&logName=projects%2Fpalscanpro%2Flogs%2Fappengine.googleapis.com%252Frequest_log&scrollTimestamp=2018-12-30T11:56:43.715483000Z)

# Conclusion and Discussion
We faced many challenges while building our service, First of all we had to change the whole project with another idea becouse we wanted it to be useful to us so we went for an idea that is near to our Graduation project, Hence we can reuse the service. We had many coding problems while building the service,Furthermore one of the most tiring things was to deal with github beacause it was our first time using it. And as for the time at some points of the project (especially the last parts) we had to woke up all night to adjust with the deadline.  

# Bonus Zone
## Design Patterns
### Inventory: Service layers

![image](https://user-images.githubusercontent.com/36053501/50549424-652a1e00-0c65-11e9-8bbb-6bc444aaf32d.png)

## Service Monitoring
You can view dashboard for APIs here : [https://console.cloud.google.com/apis/dashboard?authuser=1&organizationId=1003645834774&project=palscanpro]

> ![image](https://user-images.githubusercontent.com/36053501/50549092-9142a080-0c5f-11e9-962a-c9b1a1e64e7c.png)

> ![image](https://user-images.githubusercontent.com/36053501/50549239-15962300-0c62-11e9-8906-9bbfcce5f88b.png)

The image above shows that traffic response code of Places API to the request we make through ARC gives 200 OK in rate of 95.83%
and 403 (which means the the service responded, but the invokation is wrong) in rate of 4.17% 

# APPENDIX
## Documentation for API Endpoints :

All URIs are relative to *https://palscanpro.appspot.com/*

### PalScanProControllerApi (CompositeServiceControllerApi)

All URIs are relative to *https://palscanpro.appspot.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteScannedImageUsingDELETE**](PalScanProControllerApi.md#deleteScannedImageUsingDELETE) | **DELETE** /api/palscan/delete/{id} | DeletescannedImage
[**filterScannedImageUsingPOST**](PalScanProControllerApi.md#filterScannedImageUsingPOST) | **POST** /api/palscan/filter/{id} | Filter scanned Image
[**getNameplaceUsingGET**](PalScanProControllerApi.md#getNameplaceUsingGET) | **GET** /api/palscan/place | getLocation
[**getScanImageUsingGET**](PalScanProControllerApi.md#getScanImageUsingGET) | **GET** /api/palscan/scan | get scanned image 
[**getplaceUsingPOST**](PalScanProControllerApi.md#getplaceUsingPOST) | **POST** /api/palscan/coordinate | get lat &amp; lng
[**isGoodQUsingGET**](PalScanProControllerApi.md#isGoodQUsingGET) | **GET** /api/palscan/quality/{id} | getQOImage
[**uploadScannedImageUsingPOST**](PalScanProControllerApi.md#uploadScannedImageUsingPOST) | **POST** /api/palscan/upload | uploadScannedImage


## Documentation for Models
 - [ScannnedImage](docs/ScannnedImage.md)

## Documentation for Authorization

To use the service You need to include this json file to your system path Authorization so that we inform Google that You
have the credentials to use it's services.
You can use my service by replacing localhost:8080 with [https://palscanpro.appspot.com]

## Authors

> jawabranagham@gmail.com

> Israarajahamed@gmail.com



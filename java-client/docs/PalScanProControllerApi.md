# PalScanProControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteScannedImageUsingDELETE**](PalScanProControllerApi.md#deleteScannedImageUsingDELETE) | **DELETE** /api/palscan/delete/{id} | DeletescannedImage
[**filterScannedImageUsingPOST**](PalScanProControllerApi.md#filterScannedImageUsingPOST) | **POST** /api/palscan/filter/{id} | Filter scanned Image
[**getNameplaceUsingGET**](PalScanProControllerApi.md#getNameplaceUsingGET) | **GET** /api/palscan/place | getLocation
[**getScanImageUsingGET**](PalScanProControllerApi.md#getScanImageUsingGET) | **GET** /api/palscan/scan | get scanned image 
[**getplaceUsingPOST**](PalScanProControllerApi.md#getplaceUsingPOST) | **POST** /api/palscan/coordinate | get lat &amp; lng
[**isGoodQUsingGET**](PalScanProControllerApi.md#isGoodQUsingGET) | **GET** /api/palscan/quality/{id} | getQOImage
[**uploadScannedImageUsingPOST**](PalScanProControllerApi.md#uploadScannedImageUsingPOST) | **POST** /api/palscan/upload | uploadScannedImage


<a name="deleteScannedImageUsingDELETE"></a>
# **deleteScannedImageUsingDELETE**
> List&lt;Object&gt; deleteScannedImageUsingDELETE(id)

DeletescannedImage

THis operation for delete scanned image

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PalScanProControllerApi;


PalScanProControllerApi apiInstance = new PalScanProControllerApi();
Integer id = 56; // Integer | id
try {
    List<Object> result = apiInstance.deleteScannedImageUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalScanProControllerApi#deleteScannedImageUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="filterScannedImageUsingPOST"></a>
# **filterScannedImageUsingPOST**
> List&lt;Object&gt; filterScannedImageUsingPOST(imagePlugin)

Filter scanned Image

THis operation for enhance scanned image

### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imagePlugin** | **String**| imagePlugin |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getNameplaceUsingGET"></a>
# **getNameplaceUsingGET**
> List&lt;Object&gt; getNameplaceUsingGET(lat, lng)

getLocation

THis operation for where is scanned image taken 

### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lat** | **String**| lat | [optional]
 **lng** | **String**| lng | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getScanImageUsingGET"></a>
# **getScanImageUsingGET**
> List&lt;Object&gt; getScanImageUsingGET()

get scanned image 

This get scaned image

### Example
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

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getplaceUsingPOST"></a>
# **getplaceUsingPOST**
> List&lt;Object&gt; getplaceUsingPOST()

get lat &amp; lng

THis operation for where is scanned image taken 

### Example
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

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="isGoodQUsingGET"></a>
# **isGoodQUsingGET**
> List&lt;Object&gt; isGoodQUsingGET(id)

getQOImage

Check if it has a good Q

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PalScanProControllerApi;


PalScanProControllerApi apiInstance = new PalScanProControllerApi();
Integer id = 56; // Integer | id
try {
    List<Object> result = apiInstance.isGoodQUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalScanProControllerApi#isGoodQUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="uploadScannedImageUsingPOST"></a>
# **uploadScannedImageUsingPOST**
> List&lt;Object&gt; uploadScannedImageUsingPOST()

uploadScannedImage

THis operation for uplaod scanned image with its data

### Example
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

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


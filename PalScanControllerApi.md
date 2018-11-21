# PalScanControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteScannedImageUsingDELETE**](PalScanControllerApi.md#deleteScannedImageUsingDELETE) | **DELETE** /api/palscan/api/delete | deleteScannedImage
[**getFilterUsingGET**](PalScanControllerApi.md#getFilterUsingGET) | **GET** /api/palscan/api/filter | getFilter
[**getScanImageUsingGET**](PalScanControllerApi.md#getScanImageUsingGET) | **GET** /api/palscan/api/scan | getImage
[**getplaceUsingGET**](PalScanControllerApi.md#getplaceUsingGET) | **GET** /api/palscan/api/place | getplace
[**uploadScannedImageUsingPOST**](PalScanControllerApi.md#uploadScannedImageUsingPOST) | **POST** /api/palscan/api/upload | uploadScannedImage


<a name="deleteScannedImageUsingDELETE"></a>
# **deleteScannedImageUsingDELETE**
> String deleteScannedImageUsingDELETE(i)

deleteScannedImage

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PalScanControllerApi;


PalScanControllerApi apiInstance = new PalScanControllerApi();
String i = "i_example"; // String | i
try {
    String result = apiInstance.deleteScannedImageUsingDELETE(i);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalScanControllerApi#deleteScannedImageUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **i** | **String**| i |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFilterUsingGET"></a>
# **getFilterUsingGET**
> Integer getFilterUsingGET(i)

getFilter

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PalScanControllerApi;


PalScanControllerApi apiInstance = new PalScanControllerApi();
String i = "i_example"; // String | i
try {
    Integer result = apiInstance.getFilterUsingGET(i);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalScanControllerApi#getFilterUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **i** | **String**| i |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getScanImageUsingGET"></a>
# **getScanImageUsingGET**
> List&lt;Object&gt; getScanImageUsingGET()

getImage

This get scaned image

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PalScanControllerApi;


PalScanControllerApi apiInstance = new PalScanControllerApi();
try {
    List<Object> result = apiInstance.getScanImageUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalScanControllerApi#getScanImageUsingGET");
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

<a name="getplaceUsingGET"></a>
# **getplaceUsingGET**
> String getplaceUsingGET(i)

getplace

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PalScanControllerApi;


PalScanControllerApi apiInstance = new PalScanControllerApi();
String i = "i_example"; // String | i
try {
    String result = apiInstance.getplaceUsingGET(i);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalScanControllerApi#getplaceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **i** | **String**| i |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="uploadScannedImageUsingPOST"></a>
# **uploadScannedImageUsingPOST**
> String uploadScannedImageUsingPOST(i)

uploadScannedImage

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PalScanControllerApi;


PalScanControllerApi apiInstance = new PalScanControllerApi();
ImageModelClass i = new ImageModelClass(); // ImageModelClass | i
try {
    String result = apiInstance.uploadScannedImageUsingPOST(i);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalScanControllerApi#uploadScannedImageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **i** | [**ImageModelClass**](ImageModelClass.md)| i |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


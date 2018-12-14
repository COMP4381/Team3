# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.PalScanProControllerApi;

import java.io.File;
import java.util.*;

public class PalScanProControllerApiExample {

    public static void main(String[] args) {
        
        PalScanProControllerApi apiInstance = new PalScanProControllerApi();
        Integer id = 56; // Integer | id
        try {
            List<Object> result = apiInstance.deleteScannedImageUsingDELETE(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PalScanProControllerApi#deleteScannedImageUsingDELETE");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PalScanProControllerApi* | [**deleteScannedImageUsingDELETE**](docs/PalScanProControllerApi.md#deleteScannedImageUsingDELETE) | **DELETE** /api/palscan/delete/{id} | DeletescannedImage
*PalScanProControllerApi* | [**filterScannedImageUsingPOST**](docs/PalScanProControllerApi.md#filterScannedImageUsingPOST) | **POST** /api/palscan/filter/{id} | Filter scanned Image
*PalScanProControllerApi* | [**getNameplaceUsingGET**](docs/PalScanProControllerApi.md#getNameplaceUsingGET) | **GET** /api/palscan/place | getLocation
*PalScanProControllerApi* | [**getScanImageUsingGET**](docs/PalScanProControllerApi.md#getScanImageUsingGET) | **GET** /api/palscan/scan | get scanned image 
*PalScanProControllerApi* | [**getplaceUsingPOST**](docs/PalScanProControllerApi.md#getplaceUsingPOST) | **POST** /api/palscan/coordinate | get lat &amp; lng
*PalScanProControllerApi* | [**isGoodQUsingGET**](docs/PalScanProControllerApi.md#isGoodQUsingGET) | **GET** /api/palscan/quality/{id} | getQOImage
*PalScanProControllerApi* | [**uploadScannedImageUsingPOST**](docs/PalScanProControllerApi.md#uploadScannedImageUsingPOST) | **POST** /api/palscan/upload | uploadScannedImage


## Documentation for Models

 - [ScannnedImage](docs/ScannnedImage.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




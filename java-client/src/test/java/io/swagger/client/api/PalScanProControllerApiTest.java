/*
 * PALScan API
 * PALScan API reference for developers
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PalScanProControllerApi
 */
@Ignore
public class PalScanProControllerApiTest {

    private final PalScanProControllerApi api = new PalScanProControllerApi();

    
    /**
     * DeletescannedImage
     *
     * THis operation for delete scanned image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteScannedImageUsingDELETETest() throws ApiException {
        Integer id = null;
        List<Object> response = api.deleteScannedImageUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * Filter scanned Image
     *
     * THis operation for enhance scanned image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterScannedImageUsingPOSTTest() throws ApiException {
        String imagePlugin = null;
        List<Object> response = api.filterScannedImageUsingPOST(imagePlugin);

        // TODO: test validations
    }
    
    /**
     * getLocation
     *
     * THis operation for where is scanned image taken 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNameplaceUsingGETTest() throws ApiException {
        String lat = null;
        String lng = null;
        List<Object> response = api.getNameplaceUsingGET(lat, lng);

        // TODO: test validations
    }
    
    /**
     * get scanned image 
     *
     * This get scaned image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScanImageUsingGETTest() throws ApiException {
        List<Object> response = api.getScanImageUsingGET();

        // TODO: test validations
    }
    
    /**
     * get lat &amp; lng
     *
     * THis operation for where is scanned image taken 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getplaceUsingPOSTTest() throws ApiException {
        List<Object> response = api.getplaceUsingPOST();

        // TODO: test validations
    }
    
    /**
     * getQOImage
     *
     * Check if it has a good Q
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isGoodQUsingGETTest() throws ApiException {
        Integer id = null;
        List<Object> response = api.isGoodQUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * uploadScannedImage
     *
     * THis operation for uplaod scanned image with its data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadScannedImageUsingPOSTTest() throws ApiException {
        List<Object> response = api.uploadScannedImageUsingPOST();

        // TODO: test validations
    }
    
}

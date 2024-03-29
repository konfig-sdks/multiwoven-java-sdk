/*
 * MultiWoven API
 * Open-source Reverse ETL that makes data segmentation, sync and activation both easy and fully secure.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ConnectorsCreateNewConnectorRequest;
import com.konfigthis.client.model.ConnectorsCreateNewConnectorRequestConnector;
import com.konfigthis.client.model.ConnectorsCreateNewConnectorResponse;
import com.konfigthis.client.model.ConnectorsDiscoverCatalogInfoResponse;
import com.konfigthis.client.model.ConnectorsGetByIdResponse;
import com.konfigthis.client.model.ConnectorsListAllResponse;
import com.konfigthis.client.model.ConnectorsQuerySourceRequest;
import com.konfigthis.client.model.ConnectorsUpdateByIdRequest;
import com.konfigthis.client.model.ConnectorsUpdateByIdRequestConnector;
import com.konfigthis.client.model.ConnectorsUpdateByIdResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectorsApi
 */
@Disabled
public class ConnectorsApiTest {

    private static ConnectorsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ConnectorsApi(apiClient);
    }

    /**
     * Creates a connector
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewConnectorTest() throws ApiException {
        ConnectorsCreateNewConnectorRequestConnector connector = null;
        ConnectorsCreateNewConnectorResponse response = api.createNewConnector()
                .connector(connector)
                .execute();
        // TODO: test validations
    }

    /**
     * Deletes a specific connector by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByIdTest() throws ApiException {
        String id = null;
        api.deleteById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Discovers catalog information for a specified connector
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void discoverCatalogInfoTest() throws ApiException {
        String id = null;
        ConnectorsDiscoverCatalogInfoResponse response = api.discoverCatalogInfo(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a specific connector by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String id = null;
        ConnectorsGetByIdResponse response = api.getById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Lists all connectors
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        ConnectorsListAllResponse response = api.listAll()
                .execute();
        // TODO: test validations
    }

    /**
     * Query your source data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void querySourceTest() throws ApiException {
        Integer id = null;
        String query = null;
        List<Map<String, Object>> response = api.querySource(id)
                .query(query)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates a specific connector by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdTest() throws ApiException {
        String id = null;
        ConnectorsUpdateByIdRequestConnector connector = null;
        ConnectorsUpdateByIdResponse response = api.updateById(id)
                .connector(connector)
                .execute();
        // TODO: test validations
    }

}

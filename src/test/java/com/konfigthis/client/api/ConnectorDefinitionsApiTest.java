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
import com.konfigthis.client.model.ConnectorDefinitionsCheckConnectionRequest;
import com.konfigthis.client.model.ConnectorDefinitionsCheckConnectionResponse;
import com.konfigthis.client.model.ConnectorDefinitionsGetBasedOnTypeResponseInner;
import com.konfigthis.client.model.ConnectorDefinitionsGetByNameResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectorDefinitionsApi
 */
@Disabled
public class ConnectorDefinitionsApiTest {

    private static ConnectorDefinitionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ConnectorDefinitionsApi(apiClient);
    }

    /**
     * Checks the connection for a specified connector definition
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkConnectionTest() throws ApiException {
        String type = null;
        String name = null;
        Map<String, Object> connectionSpec = null;
        ConnectorDefinitionsCheckConnectionResponse response = api.checkConnection()
                .type(type)
                .name(name)
                .connectionSpec(connectionSpec)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve connector definitions based on type
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBasedOnTypeTest() throws ApiException {
        String type = null;
        List<ConnectorDefinitionsGetBasedOnTypeResponseInner> response = api.getBasedOnType(type)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve specific connector definition based on its name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByNameTest() throws ApiException {
        String connectorName = null;
        String type = null;
        ConnectorDefinitionsGetByNameResponse response = api.getByName(connectorName, type)
                .execute();
        // TODO: test validations
    }

}

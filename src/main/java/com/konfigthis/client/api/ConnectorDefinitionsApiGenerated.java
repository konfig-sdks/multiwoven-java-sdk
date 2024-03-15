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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.ConnectorDefinitionsCheckConnectionRequest;
import com.konfigthis.client.model.ConnectorDefinitionsCheckConnectionResponse;
import com.konfigthis.client.model.ConnectorDefinitionsGetBasedOnTypeResponseInner;
import com.konfigthis.client.model.ConnectorDefinitionsGetByNameResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ConnectorDefinitionsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConnectorDefinitionsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ConnectorDefinitionsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call checkConnectionCall(ConnectorDefinitionsCheckConnectionRequest connectorDefinitionsCheckConnectionRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = connectorDefinitionsCheckConnectionRequest;

        // create path and map variables
        String localVarPath = "/api/v1/connector_definitions/check_connection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkConnectionValidateBeforeCall(ConnectorDefinitionsCheckConnectionRequest connectorDefinitionsCheckConnectionRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'connectorDefinitionsCheckConnectionRequest' is set
        if (connectorDefinitionsCheckConnectionRequest == null) {
            throw new ApiException("Missing the required parameter 'connectorDefinitionsCheckConnectionRequest' when calling checkConnection(Async)");
        }

        return checkConnectionCall(connectorDefinitionsCheckConnectionRequest, _callback);

    }


    private ApiResponse<ConnectorDefinitionsCheckConnectionResponse> checkConnectionWithHttpInfo(ConnectorDefinitionsCheckConnectionRequest connectorDefinitionsCheckConnectionRequest) throws ApiException {
        okhttp3.Call localVarCall = checkConnectionValidateBeforeCall(connectorDefinitionsCheckConnectionRequest, null);
        Type localVarReturnType = new TypeToken<ConnectorDefinitionsCheckConnectionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call checkConnectionAsync(ConnectorDefinitionsCheckConnectionRequest connectorDefinitionsCheckConnectionRequest, final ApiCallback<ConnectorDefinitionsCheckConnectionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkConnectionValidateBeforeCall(connectorDefinitionsCheckConnectionRequest, _callback);
        Type localVarReturnType = new TypeToken<ConnectorDefinitionsCheckConnectionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CheckConnectionRequestBuilder {
        private String type;
        private String name;
        private Map<String, Object> connectionSpec;

        private CheckConnectionRequestBuilder() {
        }

        /**
         * Set type
         * @param type  (optional)
         * @return CheckConnectionRequestBuilder
         */
        public CheckConnectionRequestBuilder type(String type) {
            this.type = type;
            return this;
        }
        
        /**
         * Set name
         * @param name  (optional)
         * @return CheckConnectionRequestBuilder
         */
        public CheckConnectionRequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Set connectionSpec
         * @param connectionSpec Generic connection specification structure. Specifics depend on the connector type. (optional)
         * @return CheckConnectionRequestBuilder
         */
        public CheckConnectionRequestBuilder connectionSpec(Map<String, Object> connectionSpec) {
            this.connectionSpec = connectionSpec;
            return this;
        }
        
        /**
         * Build call for checkConnection
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Connection check successful </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            ConnectorDefinitionsCheckConnectionRequest connectorDefinitionsCheckConnectionRequest = buildBodyParams();
            return checkConnectionCall(connectorDefinitionsCheckConnectionRequest, _callback);
        }

        private ConnectorDefinitionsCheckConnectionRequest buildBodyParams() {
            ConnectorDefinitionsCheckConnectionRequest connectorDefinitionsCheckConnectionRequest = new ConnectorDefinitionsCheckConnectionRequest();
            if (this.type != null)
            connectorDefinitionsCheckConnectionRequest.type(ConnectorDefinitionsCheckConnectionRequest.TypeEnum.fromValue(this.type));
            connectorDefinitionsCheckConnectionRequest.name(this.name);
            connectorDefinitionsCheckConnectionRequest.connectionSpec(this.connectionSpec);
            return connectorDefinitionsCheckConnectionRequest;
        }

        /**
         * Execute checkConnection request
         * @return ConnectorDefinitionsCheckConnectionResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Connection check successful </td><td>  -  </td></tr>
         </table>
         */
        public ConnectorDefinitionsCheckConnectionResponse execute() throws ApiException {
            ConnectorDefinitionsCheckConnectionRequest connectorDefinitionsCheckConnectionRequest = buildBodyParams();
            ApiResponse<ConnectorDefinitionsCheckConnectionResponse> localVarResp = checkConnectionWithHttpInfo(connectorDefinitionsCheckConnectionRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute checkConnection request with HTTP info returned
         * @return ApiResponse&lt;ConnectorDefinitionsCheckConnectionResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Connection check successful </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ConnectorDefinitionsCheckConnectionResponse> executeWithHttpInfo() throws ApiException {
            ConnectorDefinitionsCheckConnectionRequest connectorDefinitionsCheckConnectionRequest = buildBodyParams();
            return checkConnectionWithHttpInfo(connectorDefinitionsCheckConnectionRequest);
        }

        /**
         * Execute checkConnection request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Connection check successful </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ConnectorDefinitionsCheckConnectionResponse> _callback) throws ApiException {
            ConnectorDefinitionsCheckConnectionRequest connectorDefinitionsCheckConnectionRequest = buildBodyParams();
            return checkConnectionAsync(connectorDefinitionsCheckConnectionRequest, _callback);
        }
    }

    /**
     * Checks the connection for a specified connector definition
     * 
     * @param connectorDefinitionsCheckConnectionRequest  (required)
     * @return CheckConnectionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Connection check successful </td><td>  -  </td></tr>
     </table>
     */
    public CheckConnectionRequestBuilder checkConnection() throws IllegalArgumentException {
        return new CheckConnectionRequestBuilder();
    }
    private okhttp3.Call getBasedOnTypeCall(String type, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/connector_definitions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBasedOnTypeValidateBeforeCall(String type, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getBasedOnType(Async)");
        }

        return getBasedOnTypeCall(type, _callback);

    }


    private ApiResponse<List<ConnectorDefinitionsGetBasedOnTypeResponseInner>> getBasedOnTypeWithHttpInfo(String type) throws ApiException {
        okhttp3.Call localVarCall = getBasedOnTypeValidateBeforeCall(type, null);
        Type localVarReturnType = new TypeToken<List<ConnectorDefinitionsGetBasedOnTypeResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getBasedOnTypeAsync(String type, final ApiCallback<List<ConnectorDefinitionsGetBasedOnTypeResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBasedOnTypeValidateBeforeCall(type, _callback);
        Type localVarReturnType = new TypeToken<List<ConnectorDefinitionsGetBasedOnTypeResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetBasedOnTypeRequestBuilder {
        private final String type;

        private GetBasedOnTypeRequestBuilder(String type) {
            this.type = type;
        }

        /**
         * Build call for getBasedOnType
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getBasedOnTypeCall(type, _callback);
        }


        /**
         * Execute getBasedOnType request
         * @return List&lt;ConnectorDefinitionsGetBasedOnTypeResponseInner&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
         </table>
         */
        public List<ConnectorDefinitionsGetBasedOnTypeResponseInner> execute() throws ApiException {
            ApiResponse<List<ConnectorDefinitionsGetBasedOnTypeResponseInner>> localVarResp = getBasedOnTypeWithHttpInfo(type);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getBasedOnType request with HTTP info returned
         * @return ApiResponse&lt;List&lt;ConnectorDefinitionsGetBasedOnTypeResponseInner&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<ConnectorDefinitionsGetBasedOnTypeResponseInner>> executeWithHttpInfo() throws ApiException {
            return getBasedOnTypeWithHttpInfo(type);
        }

        /**
         * Execute getBasedOnType request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<ConnectorDefinitionsGetBasedOnTypeResponseInner>> _callback) throws ApiException {
            return getBasedOnTypeAsync(type, _callback);
        }
    }

    /**
     * Retrieve connector definitions based on type
     * 
     * @param type Type of the connector (source or destination) (required)
     * @return GetBasedOnTypeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public GetBasedOnTypeRequestBuilder getBasedOnType(String type) throws IllegalArgumentException {
        if (type == null) throw new IllegalArgumentException("\"type\" is required but got null");
            

        return new GetBasedOnTypeRequestBuilder(type);
    }
    private okhttp3.Call getByNameCall(String connectorName, String type, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/connector_definitions/{connector_name}"
            .replace("{" + "connector_name" + "}", localVarApiClient.escapeString(connectorName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getByNameValidateBeforeCall(String connectorName, String type, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'connectorName' is set
        if (connectorName == null) {
            throw new ApiException("Missing the required parameter 'connectorName' when calling getByName(Async)");
        }

        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getByName(Async)");
        }

        return getByNameCall(connectorName, type, _callback);

    }


    private ApiResponse<ConnectorDefinitionsGetByNameResponse> getByNameWithHttpInfo(String connectorName, String type) throws ApiException {
        okhttp3.Call localVarCall = getByNameValidateBeforeCall(connectorName, type, null);
        Type localVarReturnType = new TypeToken<ConnectorDefinitionsGetByNameResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByNameAsync(String connectorName, String type, final ApiCallback<ConnectorDefinitionsGetByNameResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByNameValidateBeforeCall(connectorName, type, _callback);
        Type localVarReturnType = new TypeToken<ConnectorDefinitionsGetByNameResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByNameRequestBuilder {
        private final String connectorName;
        private final String type;

        private GetByNameRequestBuilder(String connectorName, String type) {
            this.connectorName = connectorName;
            this.type = type;
        }

        /**
         * Build call for getByName
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getByNameCall(connectorName, type, _callback);
        }


        /**
         * Execute getByName request
         * @return ConnectorDefinitionsGetByNameResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
         </table>
         */
        public ConnectorDefinitionsGetByNameResponse execute() throws ApiException {
            ApiResponse<ConnectorDefinitionsGetByNameResponse> localVarResp = getByNameWithHttpInfo(connectorName, type);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getByName request with HTTP info returned
         * @return ApiResponse&lt;ConnectorDefinitionsGetByNameResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ConnectorDefinitionsGetByNameResponse> executeWithHttpInfo() throws ApiException {
            return getByNameWithHttpInfo(connectorName, type);
        }

        /**
         * Execute getByName request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ConnectorDefinitionsGetByNameResponse> _callback) throws ApiException {
            return getByNameAsync(connectorName, type, _callback);
        }
    }

    /**
     * Retrieve specific connector definition based on its name
     * 
     * @param connectorName Name of the connector (required)
     * @param type Type of the connector (source or destination) (required)
     * @return GetByNameRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public GetByNameRequestBuilder getByName(String connectorName, String type) throws IllegalArgumentException {
        if (connectorName == null) throw new IllegalArgumentException("\"connectorName\" is required but got null");
            

        if (type == null) throw new IllegalArgumentException("\"type\" is required but got null");
            

        return new GetByNameRequestBuilder(connectorName, type);
    }
}

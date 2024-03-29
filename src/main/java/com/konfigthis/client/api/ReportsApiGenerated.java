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


import com.konfigthis.client.model.ReportsGetDataBasedOnTypeResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ReportsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ReportsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getDataBasedOnTypeCall(String type, String metric, List<Integer> connectorIds, String timePeriod, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/reports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (metric != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("metric", metric));
        }

        if (connectorIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "connector_ids", connectorIds));
        }

        if (timePeriod != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_period", timePeriod));
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDataBasedOnTypeValidateBeforeCall(String type, String metric, List<Integer> connectorIds, String timePeriod, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getDataBasedOnType(Async)");
        }

        return getDataBasedOnTypeCall(type, metric, connectorIds, timePeriod, _callback);

    }


    private ApiResponse<ReportsGetDataBasedOnTypeResponse> getDataBasedOnTypeWithHttpInfo(String type, String metric, List<Integer> connectorIds, String timePeriod) throws ApiException {
        okhttp3.Call localVarCall = getDataBasedOnTypeValidateBeforeCall(type, metric, connectorIds, timePeriod, null);
        Type localVarReturnType = new TypeToken<ReportsGetDataBasedOnTypeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDataBasedOnTypeAsync(String type, String metric, List<Integer> connectorIds, String timePeriod, final ApiCallback<ReportsGetDataBasedOnTypeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDataBasedOnTypeValidateBeforeCall(type, metric, connectorIds, timePeriod, _callback);
        Type localVarReturnType = new TypeToken<ReportsGetDataBasedOnTypeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDataBasedOnTypeRequestBuilder {
        private final String type;
        private String metric;
        private List<Integer> connectorIds;
        private String timePeriod;

        private GetDataBasedOnTypeRequestBuilder(String type) {
            this.type = type;
        }

        /**
         * Set metric
         * @param metric Specific metric of interest in the report. (optional)
         * @return GetDataBasedOnTypeRequestBuilder
         */
        public GetDataBasedOnTypeRequestBuilder metric(String metric) {
            this.metric = metric;
            return this;
        }
        
        /**
         * Set connectorIds
         * @param connectorIds IDs of the connectors. (optional)
         * @return GetDataBasedOnTypeRequestBuilder
         */
        public GetDataBasedOnTypeRequestBuilder connectorIds(List<Integer> connectorIds) {
            this.connectorIds = connectorIds;
            return this;
        }
        
        /**
         * Set timePeriod
         * @param timePeriod Time period for the report. (optional)
         * @return GetDataBasedOnTypeRequestBuilder
         */
        public GetDataBasedOnTypeRequestBuilder timePeriod(String timePeriod) {
            this.timePeriod = timePeriod;
            return this;
        }
        
        /**
         * Build call for getDataBasedOnType
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved report data. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Validation error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDataBasedOnTypeCall(type, metric, connectorIds, timePeriod, _callback);
        }


        /**
         * Execute getDataBasedOnType request
         * @return ReportsGetDataBasedOnTypeResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved report data. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Validation error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public ReportsGetDataBasedOnTypeResponse execute() throws ApiException {
            ApiResponse<ReportsGetDataBasedOnTypeResponse> localVarResp = getDataBasedOnTypeWithHttpInfo(type, metric, connectorIds, timePeriod);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getDataBasedOnType request with HTTP info returned
         * @return ApiResponse&lt;ReportsGetDataBasedOnTypeResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved report data. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Validation error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ReportsGetDataBasedOnTypeResponse> executeWithHttpInfo() throws ApiException {
            return getDataBasedOnTypeWithHttpInfo(type, metric, connectorIds, timePeriod);
        }

        /**
         * Execute getDataBasedOnType request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved report data. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Validation error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ReportsGetDataBasedOnTypeResponse> _callback) throws ApiException {
            return getDataBasedOnTypeAsync(type, metric, connectorIds, timePeriod, _callback);
        }
    }

    /**
     * Get report data based on given type
     * 
     * @param type Type of the report to query. (required)
     * @return GetDataBasedOnTypeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved report data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public GetDataBasedOnTypeRequestBuilder getDataBasedOnType(String type) throws IllegalArgumentException {
        if (type == null) throw new IllegalArgumentException("\"type\" is required but got null");
            

        return new GetDataBasedOnTypeRequestBuilder(type);
    }
}

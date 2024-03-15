# SyncsApi

All URIs are relative to *https://api.multiwoven.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewSyncOperation**](SyncsApi.md#createNewSyncOperation) | **POST** /api/v1/syncs | Create a new sync operation |
| [**deleteSyncOperation**](SyncsApi.md#deleteSyncOperation) | **DELETE** /api/v1/syncs/{id} | Delete a specific sync operation |
| [**getReportData**](SyncsApi.md#getReportData) | **GET** /api/v1/syncs/configurations | Get report data based on given type |
| [**listOperations**](SyncsApi.md#listOperations) | **GET** /api/v1/syncs | List all sync operations |
| [**showDetails**](SyncsApi.md#showDetails) | **GET** /api/v1/syncs/{id} | Show details of a specific sync operation |
| [**updateSpecificSync**](SyncsApi.md#updateSpecificSync) | **PUT** /api/v1/syncs/{id} | Update a specific sync operation |


<a name="createNewSyncOperation"></a>
# **createNewSyncOperation**
> SyncsCreateNewSyncOperationResponse createNewSyncOperation(syncsCreateNewSyncOperationRequest).execute();

Create a new sync operation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Multiwoven;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SyncsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.multiwoven.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Multiwoven client = new Multiwoven(configuration);
    SyncsCreateNewSyncOperationRequestSync sync = new SyncsCreateNewSyncOperationRequestSync();
    try {
      SyncsCreateNewSyncOperationResponse result = client
              .syncs
              .createNewSyncOperation()
              .sync(sync)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getAttributes());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncsApi#createNewSyncOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SyncsCreateNewSyncOperationResponse> response = client
              .syncs
              .createNewSyncOperation()
              .sync(sync)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncsApi#createNewSyncOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **syncsCreateNewSyncOperationRequest** | [**SyncsCreateNewSyncOperationRequest**](SyncsCreateNewSyncOperationRequest.md)|  | |

### Return type

[**SyncsCreateNewSyncOperationResponse**](SyncsCreateNewSyncOperationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sync operation created successfully |  -  |

<a name="deleteSyncOperation"></a>
# **deleteSyncOperation**
> deleteSyncOperation(id).execute();

Delete a specific sync operation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Multiwoven;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SyncsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.multiwoven.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Multiwoven client = new Multiwoven(configuration);
    String id = "id_example"; // The ID of the sync operation to delete
    try {
      client
              .syncs
              .deleteSyncOperation(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncsApi#deleteSyncOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .syncs
              .deleteSyncOperation(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncsApi#deleteSyncOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the sync operation to delete | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content, indicating the sync operation was successfully deleted |  -  |

<a name="getReportData"></a>
# **getReportData**
> SyncsGetReportDataResponse getReportData().execute();

Get report data based on given type

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Multiwoven;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SyncsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.multiwoven.com";
    Multiwoven client = new Multiwoven(configuration);
    try {
      SyncsGetReportDataResponse result = client
              .syncs
              .getReportData()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncsApi#getReportData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SyncsGetReportDataResponse> response = client
              .syncs
              .getReportData()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncsApi#getReportData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SyncsGetReportDataResponse**](SyncsGetReportDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved report data. |  -  |

<a name="listOperations"></a>
# **listOperations**
> SyncsListOperationsResponse listOperations().pageNumber(pageNumber).pageSize(pageSize).execute();

List all sync operations

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Multiwoven;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SyncsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.multiwoven.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Multiwoven client = new Multiwoven(configuration);
    Integer pageNumber = 56; // Page number for pagination
    Integer pageSize = 56; // Number of items per page for pagination
    try {
      SyncsListOperationsResponse result = client
              .syncs
              .listOperations()
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncsApi#listOperations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SyncsListOperationsResponse> response = client
              .syncs
              .listOperations()
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncsApi#listOperations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageNumber** | **Integer**| Page number for pagination | [optional] |
| **pageSize** | **Integer**| Number of items per page for pagination | [optional] |

### Return type

[**SyncsListOperationsResponse**](SyncsListOperationsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of sync operations |  -  |

<a name="showDetails"></a>
# **showDetails**
> SyncsShowDetailsResponse showDetails(id).execute();

Show details of a specific sync operation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Multiwoven;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SyncsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.multiwoven.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Multiwoven client = new Multiwoven(configuration);
    String id = "id_example";
    try {
      SyncsShowDetailsResponse result = client
              .syncs
              .showDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getAttributes());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncsApi#showDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SyncsShowDetailsResponse> response = client
              .syncs
              .showDetails(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncsApi#showDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**SyncsShowDetailsResponse**](SyncsShowDetailsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sync details retrieved successfully |  -  |

<a name="updateSpecificSync"></a>
# **updateSpecificSync**
> SyncsUpdateSpecificSyncResponse updateSpecificSync(id, syncsUpdateSpecificSyncRequest).execute();

Update a specific sync operation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Multiwoven;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SyncsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.multiwoven.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Multiwoven client = new Multiwoven(configuration);
    String id = "id_example";
    SyncsUpdateSpecificSyncRequestSync sync = new SyncsUpdateSpecificSyncRequestSync();
    try {
      SyncsUpdateSpecificSyncResponse result = client
              .syncs
              .updateSpecificSync(id)
              .sync(sync)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getMessage());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncsApi#updateSpecificSync");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SyncsUpdateSpecificSyncResponse> response = client
              .syncs
              .updateSpecificSync(id)
              .sync(sync)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncsApi#updateSpecificSync");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **syncsUpdateSpecificSyncRequest** | [**SyncsUpdateSpecificSyncRequest**](SyncsUpdateSpecificSyncRequest.md)|  | |

### Return type

[**SyncsUpdateSpecificSyncResponse**](SyncsUpdateSpecificSyncResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sync operation updated successfully |  -  |


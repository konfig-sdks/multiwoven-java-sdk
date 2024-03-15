# SyncRecordsApi

All URIs are relative to *https://api.multiwoven.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listForSyncRun**](SyncRecordsApi.md#listForSyncRun) | **GET** /api/v1/syncs/{sync_id}/sync_runs/{sync_run_id}/sync_records | List sync records for a specific sync run |


<a name="listForSyncRun"></a>
# **listForSyncRun**
> SyncRecordsListForSyncRunResponse listForSyncRun(syncId, syncRunId).status(status).page(page).execute();

List sync records for a specific sync run

Retrieves a list of sync records for a specific sync run, optionally filtered by status.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Multiwoven;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SyncRecordsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.multiwoven.com";
    Multiwoven client = new Multiwoven(configuration);
    Integer syncId = 56; // The ID of the sync to list records for.
    Integer syncRunId = 56; // The ID of the sync run to list records for.
    String status = "status_example"; // Optional status to filter the sync records by.
    Integer page = 56; // Page number for pagination.
    try {
      SyncRecordsListForSyncRunResponse result = client
              .syncRecords
              .listForSyncRun(syncId, syncRunId)
              .status(status)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncRecordsApi#listForSyncRun");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SyncRecordsListForSyncRunResponse> response = client
              .syncRecords
              .listForSyncRun(syncId, syncRunId)
              .status(status)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncRecordsApi#listForSyncRun");
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
| **syncId** | **Integer**| The ID of the sync to list records for. | |
| **syncRunId** | **Integer**| The ID of the sync run to list records for. | |
| **status** | **String**| Optional status to filter the sync records by. | [optional] |
| **page** | **Integer**| Page number for pagination. | [optional] |

### Return type

[**SyncRecordsListForSyncRunResponse**](SyncRecordsListForSyncRunResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON array of sync records |  -  |


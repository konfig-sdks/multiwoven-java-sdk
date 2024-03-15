# ReportsApi

All URIs are relative to *https://api.multiwoven.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDataBasedOnType**](ReportsApi.md#getDataBasedOnType) | **GET** /api/v1/reports | Get report data based on given type |


<a name="getDataBasedOnType"></a>
# **getDataBasedOnType**
> ReportsGetDataBasedOnTypeResponse getDataBasedOnType(type).metric(metric).connectorIds(connectorIds).timePeriod(timePeriod).execute();

Get report data based on given type

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Multiwoven;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.multiwoven.com";
    Multiwoven client = new Multiwoven(configuration);
    String type = "workspace_activity"; // Type of the report to query.
    String metric = "sync_run_triggered"; // Specific metric of interest in the report.
    List<Integer> connectorIds = Arrays.asList(); // IDs of the connectors.
    String timePeriod = "one_week"; // Time period for the report.
    try {
      ReportsGetDataBasedOnTypeResponse result = client
              .reports
              .getDataBasedOnType(type)
              .metric(metric)
              .connectorIds(connectorIds)
              .timePeriod(timePeriod)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getDataBasedOnType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetDataBasedOnTypeResponse> response = client
              .reports
              .getDataBasedOnType(type)
              .metric(metric)
              .connectorIds(connectorIds)
              .timePeriod(timePeriod)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getDataBasedOnType");
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
| **type** | **String**| Type of the report to query. | [enum: workspace_activity] |
| **metric** | **String**| Specific metric of interest in the report. | [optional] [enum: sync_run_triggered, total_sync_run_rows, all] |
| **connectorIds** | [**List&lt;Integer&gt;**](Integer.md)| IDs of the connectors. | [optional] |
| **timePeriod** | **String**| Time period for the report. | [optional] [enum: one_week, one_day] |

### Return type

[**ReportsGetDataBasedOnTypeResponse**](ReportsGetDataBasedOnTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved report data. |  -  |
| **400** | Validation error occurred. |  -  |


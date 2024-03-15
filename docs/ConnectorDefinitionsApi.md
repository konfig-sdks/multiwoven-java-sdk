# ConnectorDefinitionsApi

All URIs are relative to *https://api.multiwoven.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkConnection**](ConnectorDefinitionsApi.md#checkConnection) | **POST** /api/v1/connector_definitions/check_connection | Checks the connection for a specified connector definition |
| [**getBasedOnType**](ConnectorDefinitionsApi.md#getBasedOnType) | **GET** /api/v1/connector_definitions | Retrieve connector definitions based on type |
| [**getByName**](ConnectorDefinitionsApi.md#getByName) | **GET** /api/v1/connector_definitions/{connector_name} | Retrieve specific connector definition based on its name |


<a name="checkConnection"></a>
# **checkConnection**
> ConnectorDefinitionsCheckConnectionResponse checkConnection(connectorDefinitionsCheckConnectionRequest).execute();

Checks the connection for a specified connector definition

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Multiwoven;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectorDefinitionsApi;
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
    String type = "source";
    String name = "name_example";
    Map<String, Object> connectionSpec = new HashMap(); // Generic connection specification structure. Specifics depend on the connector type.
    try {
      ConnectorDefinitionsCheckConnectionResponse result = client
              .connectorDefinitions
              .checkConnection()
              .type(type)
              .name(name)
              .connectionSpec(connectionSpec)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getDetails());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorDefinitionsApi#checkConnection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConnectorDefinitionsCheckConnectionResponse> response = client
              .connectorDefinitions
              .checkConnection()
              .type(type)
              .name(name)
              .connectionSpec(connectionSpec)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorDefinitionsApi#checkConnection");
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
| **connectorDefinitionsCheckConnectionRequest** | [**ConnectorDefinitionsCheckConnectionRequest**](ConnectorDefinitionsCheckConnectionRequest.md)|  | |

### Return type

[**ConnectorDefinitionsCheckConnectionResponse**](ConnectorDefinitionsCheckConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connection check successful |  -  |

<a name="getBasedOnType"></a>
# **getBasedOnType**
> List&lt;ConnectorDefinitionsGetBasedOnTypeResponseInner&gt; getBasedOnType(type).execute();

Retrieve connector definitions based on type

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Multiwoven;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectorDefinitionsApi;
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
    String type = "source"; // Type of the connector (source or destination)
    try {
      List<ConnectorDefinitionsGetBasedOnTypeResponseInner> result = client
              .connectorDefinitions
              .getBasedOnType(type)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorDefinitionsApi#getBasedOnType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ConnectorDefinitionsGetBasedOnTypeResponseInner>> response = client
              .connectorDefinitions
              .getBasedOnType(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorDefinitionsApi#getBasedOnType");
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
| **type** | **String**| Type of the connector (source or destination) | [enum: source, destination] |

### Return type

[**List&lt;ConnectorDefinitionsGetBasedOnTypeResponseInner&gt;**](ConnectorDefinitionsGetBasedOnTypeResponseInner.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="getByName"></a>
# **getByName**
> ConnectorDefinitionsGetByNameResponse getByName(connectorName, type).execute();

Retrieve specific connector definition based on its name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Multiwoven;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectorDefinitionsApi;
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
    String connectorName = "connectorName_example"; // Name of the connector
    String type = "source"; // Type of the connector (source or destination)
    try {
      ConnectorDefinitionsGetByNameResponse result = client
              .connectorDefinitions
              .getByName(connectorName, type)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getName());
      System.out.println(result.getConnectorType());
      System.out.println(result.getConnectorSubtype());
      System.out.println(result.getDocumentationUrl());
      System.out.println(result.getGithubIssueLabel());
      System.out.println(result.getIcon());
      System.out.println(result.getLicense());
      System.out.println(result.getReleaseStage());
      System.out.println(result.getSupportLevel());
      System.out.println(result.getConnectorSpec());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorDefinitionsApi#getByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConnectorDefinitionsGetByNameResponse> response = client
              .connectorDefinitions
              .getByName(connectorName, type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorDefinitionsApi#getByName");
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
| **connectorName** | **String**| Name of the connector | |
| **type** | **String**| Type of the connector (source or destination) | [enum: source, destination] |

### Return type

[**ConnectorDefinitionsGetByNameResponse**](ConnectorDefinitionsGetByNameResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


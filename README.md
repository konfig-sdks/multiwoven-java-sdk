<div align="left">

[![Visit Multiwoven](./header.png)](https://www.multiwoven.com&#x2F;)

# [Multiwoven](https://www.multiwoven.com&#x2F;)

Open-source Reverse ETL that makes data segmentation, sync and activation both easy and fully secure.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Multiwoven&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>multiwoven-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:multiwoven-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/multiwoven-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.multiwoven.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConnectorDefinitionsApi* | [**checkConnection**](docs/ConnectorDefinitionsApi.md#checkConnection) | **POST** /api/v1/connector_definitions/check_connection | Checks the connection for a specified connector definition
*ConnectorDefinitionsApi* | [**getBasedOnType**](docs/ConnectorDefinitionsApi.md#getBasedOnType) | **GET** /api/v1/connector_definitions | Retrieve connector definitions based on type
*ConnectorDefinitionsApi* | [**getByName**](docs/ConnectorDefinitionsApi.md#getByName) | **GET** /api/v1/connector_definitions/{connector_name} | Retrieve specific connector definition based on its name
*ConnectorsApi* | [**createNewConnector**](docs/ConnectorsApi.md#createNewConnector) | **POST** /api/v1/connectors | Creates a connector
*ConnectorsApi* | [**deleteById**](docs/ConnectorsApi.md#deleteById) | **DELETE** /api/v1/connectors/{id} | Deletes a specific connector by ID
*ConnectorsApi* | [**discoverCatalogInfo**](docs/ConnectorsApi.md#discoverCatalogInfo) | **GET** /api/v1/connectors/{id}/discover | Discovers catalog information for a specified connector
*ConnectorsApi* | [**getById**](docs/ConnectorsApi.md#getById) | **GET** /api/v1/connectors/{id} | Retrieves a specific connector by ID
*ConnectorsApi* | [**listAll**](docs/ConnectorsApi.md#listAll) | **GET** /api/v1/connectors | Lists all connectors
*ConnectorsApi* | [**querySource**](docs/ConnectorsApi.md#querySource) | **POST** /api/v1/connectors/{id}/query_source | Query your source data
*ConnectorsApi* | [**updateById**](docs/ConnectorsApi.md#updateById) | **PUT** /api/v1/connectors/{id} | Updates a specific connector by ID
*ModelsApi* | [**createModel**](docs/ModelsApi.md#createModel) | **POST** /api/v1/models | Creates a model
*ModelsApi* | [**deleteModel**](docs/ModelsApi.md#deleteModel) | **DELETE** /api/v1/models/{id} | Deletes a model
*ModelsApi* | [**getById**](docs/ModelsApi.md#getById) | **GET** /api/v1/models/{id} | Retrieves a model
*ModelsApi* | [**listAllModels**](docs/ModelsApi.md#listAllModels) | **GET** /api/v1/models | Lists all models
*ModelsApi* | [**updateModelById**](docs/ModelsApi.md#updateModelById) | **PUT** /api/v1/models/{id} | Updates a model
*ReportsApi* | [**getDataBasedOnType**](docs/ReportsApi.md#getDataBasedOnType) | **GET** /api/v1/reports | Get report data based on given type
*SyncRecordsApi* | [**listForSyncRun**](docs/SyncRecordsApi.md#listForSyncRun) | **GET** /api/v1/syncs/{sync_id}/sync_runs/{sync_run_id}/sync_records | List sync records for a specific sync run
*SyncRunsApi* | [**listBySyncId**](docs/SyncRunsApi.md#listBySyncId) | **GET** /api/v1/syncs/{sync_id}/sync_runs | List sync runs for a specific sync
*SyncsApi* | [**createNewSyncOperation**](docs/SyncsApi.md#createNewSyncOperation) | **POST** /api/v1/syncs | Create a new sync operation
*SyncsApi* | [**deleteSyncOperation**](docs/SyncsApi.md#deleteSyncOperation) | **DELETE** /api/v1/syncs/{id} | Delete a specific sync operation
*SyncsApi* | [**getReportData**](docs/SyncsApi.md#getReportData) | **GET** /api/v1/syncs/configurations | Get report data based on given type
*SyncsApi* | [**listOperations**](docs/SyncsApi.md#listOperations) | **GET** /api/v1/syncs | List all sync operations
*SyncsApi* | [**showDetails**](docs/SyncsApi.md#showDetails) | **GET** /api/v1/syncs/{id} | Show details of a specific sync operation
*SyncsApi* | [**updateSpecificSync**](docs/SyncsApi.md#updateSpecificSync) | **PUT** /api/v1/syncs/{id} | Update a specific sync operation


## Documentation for Models

 - [ConnectorDefinitionsCheckConnectionRequest](docs/ConnectorDefinitionsCheckConnectionRequest.md)
 - [ConnectorDefinitionsCheckConnectionResponse](docs/ConnectorDefinitionsCheckConnectionResponse.md)
 - [ConnectorDefinitionsGetBasedOnTypeResponseInner](docs/ConnectorDefinitionsGetBasedOnTypeResponseInner.md)
 - [ConnectorDefinitionsGetBasedOnTypeResponseInnerConnectorSpec](docs/ConnectorDefinitionsGetBasedOnTypeResponseInnerConnectorSpec.md)
 - [ConnectorDefinitionsGetByNameResponse](docs/ConnectorDefinitionsGetByNameResponse.md)
 - [ConnectorDefinitionsGetByNameResponseConnectorSpec](docs/ConnectorDefinitionsGetByNameResponseConnectorSpec.md)
 - [ConnectorsCreateNewConnectorRequest](docs/ConnectorsCreateNewConnectorRequest.md)
 - [ConnectorsCreateNewConnectorRequestConnector](docs/ConnectorsCreateNewConnectorRequestConnector.md)
 - [ConnectorsCreateNewConnectorResponse](docs/ConnectorsCreateNewConnectorResponse.md)
 - [ConnectorsCreateNewConnectorResponseData](docs/ConnectorsCreateNewConnectorResponseData.md)
 - [ConnectorsCreateNewConnectorResponseDataAttributes](docs/ConnectorsCreateNewConnectorResponseDataAttributes.md)
 - [ConnectorsDiscoverCatalogInfoResponse](docs/ConnectorsDiscoverCatalogInfoResponse.md)
 - [ConnectorsDiscoverCatalogInfoResponseData](docs/ConnectorsDiscoverCatalogInfoResponseData.md)
 - [ConnectorsDiscoverCatalogInfoResponseDataAttributes](docs/ConnectorsDiscoverCatalogInfoResponseDataAttributes.md)
 - [ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalog](docs/ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalog.md)
 - [ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner](docs/ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner.md)
 - [ConnectorsGetByIdResponse](docs/ConnectorsGetByIdResponse.md)
 - [ConnectorsListAllResponse](docs/ConnectorsListAllResponse.md)
 - [ConnectorsListAllResponseDataInner](docs/ConnectorsListAllResponseDataInner.md)
 - [ConnectorsListAllResponseDataInnerAttributes](docs/ConnectorsListAllResponseDataInnerAttributes.md)
 - [ConnectorsQuerySourceRequest](docs/ConnectorsQuerySourceRequest.md)
 - [ConnectorsUpdateByIdRequest](docs/ConnectorsUpdateByIdRequest.md)
 - [ConnectorsUpdateByIdRequestConnector](docs/ConnectorsUpdateByIdRequestConnector.md)
 - [ConnectorsUpdateByIdResponse](docs/ConnectorsUpdateByIdResponse.md)
 - [ConnectorsUpdateByIdResponseData](docs/ConnectorsUpdateByIdResponseData.md)
 - [ConnectorsUpdateByIdResponseDataAttributes](docs/ConnectorsUpdateByIdResponseDataAttributes.md)
 - [ModelsCreateModelRequest](docs/ModelsCreateModelRequest.md)
 - [ModelsCreateModelRequestModel](docs/ModelsCreateModelRequestModel.md)
 - [ModelsCreateModelResponse](docs/ModelsCreateModelResponse.md)
 - [ModelsGetByIdResponse](docs/ModelsGetByIdResponse.md)
 - [ModelsListAllModelsResponse](docs/ModelsListAllModelsResponse.md)
 - [ModelsListAllModelsResponseDataInner](docs/ModelsListAllModelsResponseDataInner.md)
 - [ModelsListAllModelsResponseDataInnerAttributes](docs/ModelsListAllModelsResponseDataInnerAttributes.md)
 - [ModelsListAllModelsResponseLinks](docs/ModelsListAllModelsResponseLinks.md)
 - [ModelsUpdateModelByIdRequest](docs/ModelsUpdateModelByIdRequest.md)
 - [ModelsUpdateModelByIdResponse](docs/ModelsUpdateModelByIdResponse.md)
 - [ReportsGetDataBasedOnTypeResponse](docs/ReportsGetDataBasedOnTypeResponse.md)
 - [ReportsGetDataBasedOnTypeResponseData](docs/ReportsGetDataBasedOnTypeResponseData.md)
 - [ReportsGetDataBasedOnTypeResponseDataSyncRunTriggeredInner](docs/ReportsGetDataBasedOnTypeResponseDataSyncRunTriggeredInner.md)
 - [ReportsGetDataBasedOnTypeResponseDataTotalSyncRunRowsInner](docs/ReportsGetDataBasedOnTypeResponseDataTotalSyncRunRowsInner.md)
 - [SyncRecordsListForSyncRunResponse](docs/SyncRecordsListForSyncRunResponse.md)
 - [SyncRecordsListForSyncRunResponseDataInner](docs/SyncRecordsListForSyncRunResponseDataInner.md)
 - [SyncRecordsListForSyncRunResponseDataInnerAttributes](docs/SyncRecordsListForSyncRunResponseDataInnerAttributes.md)
 - [SyncRecordsListForSyncRunResponseDataInnerAttributesRecord](docs/SyncRecordsListForSyncRunResponseDataInnerAttributesRecord.md)
 - [SyncRunsListBySyncIdResponse](docs/SyncRunsListBySyncIdResponse.md)
 - [SyncRunsListBySyncIdResponseDataInner](docs/SyncRunsListBySyncIdResponseDataInner.md)
 - [SyncRunsListBySyncIdResponseDataInnerAttributes](docs/SyncRunsListBySyncIdResponseDataInnerAttributes.md)
 - [SyncRunsListBySyncIdResponseLinks](docs/SyncRunsListBySyncIdResponseLinks.md)
 - [SyncsCreateNewSyncOperationRequest](docs/SyncsCreateNewSyncOperationRequest.md)
 - [SyncsCreateNewSyncOperationRequestSync](docs/SyncsCreateNewSyncOperationRequestSync.md)
 - [SyncsCreateNewSyncOperationResponse](docs/SyncsCreateNewSyncOperationResponse.md)
 - [SyncsGetReportDataResponse](docs/SyncsGetReportDataResponse.md)
 - [SyncsGetReportDataResponseData](docs/SyncsGetReportDataResponseData.md)
 - [SyncsGetReportDataResponseDataConfigurations](docs/SyncsGetReportDataResponseDataConfigurations.md)
 - [SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypes](docs/SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypes.md)
 - [SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic](docs/SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic.md)
 - [SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticBoolean](docs/SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticBoolean.md)
 - [SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNull](docs/SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNull.md)
 - [SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNumber](docs/SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNumber.md)
 - [SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticString](docs/SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticString.md)
 - [SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesTemplate](docs/SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesTemplate.md)
 - [SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesTemplateFilter](docs/SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesTemplateFilter.md)
 - [SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesTemplateFilterCast](docs/SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesTemplateFilterCast.md)
 - [SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesTemplateFilterRegexReplace](docs/SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesTemplateFilterRegexReplace.md)
 - [SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesTemplateVariable](docs/SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesTemplateVariable.md)
 - [SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesTemplateVariableCurrentTimestamp](docs/SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesTemplateVariableCurrentTimestamp.md)
 - [SyncsListOperationsResponse](docs/SyncsListOperationsResponse.md)
 - [SyncsListOperationsResponseDataInner](docs/SyncsListOperationsResponseDataInner.md)
 - [SyncsListOperationsResponseDataInnerAttributes](docs/SyncsListOperationsResponseDataInnerAttributes.md)
 - [SyncsListOperationsResponseLinks](docs/SyncsListOperationsResponseLinks.md)
 - [SyncsShowDetailsResponse](docs/SyncsShowDetailsResponse.md)
 - [SyncsUpdateSpecificSyncRequest](docs/SyncsUpdateSpecificSyncRequest.md)
 - [SyncsUpdateSpecificSyncRequestSync](docs/SyncsUpdateSpecificSyncRequestSync.md)
 - [SyncsUpdateSpecificSyncResponse](docs/SyncsUpdateSpecificSyncResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)

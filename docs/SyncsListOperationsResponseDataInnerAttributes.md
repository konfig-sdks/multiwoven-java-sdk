

# SyncsListOperationsResponseDataInnerAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceId** | **Integer** |  |  [optional] |
|**destinationId** | **Integer** |  |  [optional] |
|**modelId** | **Integer** |  |  [optional] |
|**_configuration** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) |  |  [optional] |
|**syncMode** | [**SyncModeEnum**](#SyncModeEnum) |  |  [optional] |
|**syncInterval** | **Integer** |  |  [optional] |
|**syncIntervalUnit** | [**SyncIntervalUnitEnum**](#SyncIntervalUnitEnum) |  |  [optional] |
|**streamName** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |



## Enum: ScheduleTypeEnum

| Name | Value |
|---- | -----|
| AUTOMATED | &quot;automated&quot; |



## Enum: SyncModeEnum

| Name | Value |
|---- | -----|
| FULL_REFRESH | &quot;full_refresh&quot; |



## Enum: SyncIntervalUnitEnum

| Name | Value |
|---- | -----|
| MINUTES | &quot;minutes&quot; |




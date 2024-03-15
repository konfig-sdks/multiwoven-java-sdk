

# SyncsCreateNewSyncOperationRequestSync


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceId** | **Integer** |  |  |
|**destinationId** | **Integer** |  |  |
|**modelId** | **Integer** |  |  |
|**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) |  |  |
|**_configuration** | **Map&lt;String, Object&gt;** |  |  |
|**streamName** | **String** |  |  |
|**syncMode** | [**SyncModeEnum**](#SyncModeEnum) |  |  |
|**syncInterval** | **Integer** |  |  |
|**syncIntervalUnit** | [**SyncIntervalUnitEnum**](#SyncIntervalUnitEnum) |  |  |



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




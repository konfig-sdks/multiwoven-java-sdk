package com.konfigthis.client;

import com.konfigthis.client.api.ConnectorDefinitionsApi;
import com.konfigthis.client.api.ConnectorsApi;
import com.konfigthis.client.api.ModelsApi;
import com.konfigthis.client.api.ReportsApi;
import com.konfigthis.client.api.SyncRecordsApi;
import com.konfigthis.client.api.SyncRunsApi;
import com.konfigthis.client.api.SyncsApi;

public class Multiwoven {
    private ApiClient apiClient;
    public final ConnectorDefinitionsApi connectorDefinitions;
    public final ConnectorsApi connectors;
    public final ModelsApi models;
    public final ReportsApi reports;
    public final SyncRecordsApi syncRecords;
    public final SyncRunsApi syncRuns;
    public final SyncsApi syncs;

    public Multiwoven() {
        this(null);
    }

    public Multiwoven(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.connectorDefinitions = new ConnectorDefinitionsApi(this.apiClient);
        this.connectors = new ConnectorsApi(this.apiClient);
        this.models = new ModelsApi(this.apiClient);
        this.reports = new ReportsApi(this.apiClient);
        this.syncRecords = new SyncRecordsApi(this.apiClient);
        this.syncRuns = new SyncRunsApi(this.apiClient);
        this.syncs = new SyncsApi(this.apiClient);
    }

}

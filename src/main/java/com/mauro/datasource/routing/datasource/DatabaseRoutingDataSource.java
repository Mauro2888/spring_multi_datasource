package com.mauro.datasource.routing.datasource;

import com.mauro.datasource.routing.web.DataBaseThreadStorage;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DatabaseRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataBaseThreadStorage.getDatabaseId();
    }
}

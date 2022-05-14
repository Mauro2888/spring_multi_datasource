package com.mauro.datasource.routing.datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {
    private final DataSourceProperties dataSourceProperties;

    public DataSourceConfiguration(DataSourceProperties dataSourceProperties) {
        this.dataSourceProperties = dataSourceProperties;
    }

    @Bean
    public DataSource dataSource() {
        DatabaseRoutingDataSource customDataSource = new DatabaseRoutingDataSource();
        customDataSource.setTargetDataSources(dataSourceProperties.getDatasources());
        customDataSource.setDefaultTargetDataSource(dataSourceProperties.getDatasources().entrySet().stream().findFirst().get().getValue());
        return customDataSource;
    }


}

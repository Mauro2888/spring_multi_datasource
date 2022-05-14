package com.mauro.datasource.routing.datasource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "group")
public class DataSourceProperties {

    private Map<Object, Object> datasources = new LinkedHashMap<>();

    public Map<Object, Object> getDatasources() {
        return datasources;
    }

    public void setDatasources(Map<String, Map<String, String>> datasources) {
        datasources
                .forEach((key, value) -> this.datasources.put(key, convert(value)));
    }

    public DataSource convert(Map<String, String> source) {
        HikariConfig config = new HikariConfig();
        config.setConnectionTestQuery("SELECT 1");
        config.setJdbcUrl(source.get("url"));
        config.setDriverClassName(source.get("driverClassName"));
        config.setUsername(source.get("username"));
        config.setPassword(source.get("password"));

        config.setAutoCommit(false);
        return new HikariDataSource(config);
    }
}

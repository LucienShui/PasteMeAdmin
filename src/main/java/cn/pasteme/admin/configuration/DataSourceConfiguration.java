package cn.pasteme.admin.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author Lucien
 * @version 1.0.0
 */
@Configuration
public class DataSourceConfiguration {

    @Bean(name = "sqlite")
    @ConfigurationProperties(prefix = "spring.datasource.sqlite")
    public DataSource dbOne() {
        return DataSourceBuilder.create().build();
    }
}

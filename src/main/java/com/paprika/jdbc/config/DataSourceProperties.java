package com.paprika.jdbc.config;

import com.paprika.jdbc.domain.DataSourceInfoDto;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

/**
 * @author adam
 * @date 2019/10/30
 */
@Component
@ConfigurationProperties(prefix = "database", ignoreUnknownFields = false)
@Data
public class DataSourceProperties {
    @NestedConfigurationProperty
    private DataSourceInfoDto mysql;
    @NestedConfigurationProperty
    private DataSourceInfoDto oracle;
    @NestedConfigurationProperty
    private DataSourceInfoDto postgresql;
    @NestedConfigurationProperty
    private DataSourceInfoDto sqlserver;
}

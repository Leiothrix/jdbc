package com.paprika.jdbc.service.impl;
import com.paprika.jdbc.config.DataSourceProperties;
import com.paprika.jdbc.domain.DataSourceInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author adam
 * @date 2019/4/25 15:26
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
@Service
@Slf4j
public class MysqlVisitServiceImpl extends AbstractDatabaseVisitImpl {

    private static DataSourceProperties dataSourceProperties;

    private static DataSourceInfoDto dataSourceInfoDto = new DataSourceInfoDto();

    @Autowired
    public void setDataSourceProperties(DataSourceProperties dataSourceProperties){
        MysqlVisitServiceImpl.dataSourceProperties = dataSourceProperties;
    }

    public static DataSourceInfoDto getDatasource(){
        dataSourceInfoDto.setClassName(dataSourceProperties.getMysql().getClassName());
        dataSourceInfoDto.setUrl(dataSourceProperties.getMysql().getUrl());
        dataSourceInfoDto.setUser(dataSourceProperties.getMysql().getUser());
        dataSourceInfoDto.setPwd(dataSourceProperties.getMysql().getPwd());
        return dataSourceInfoDto;
    }
}

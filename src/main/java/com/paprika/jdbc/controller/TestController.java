package com.paprika.jdbc.controller;

import com.paprika.jdbc.config.DataSourceProperties;
import com.paprika.jdbc.service.impl.MysqlVisitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author adam
 * @date 2019/10/30
 */
@RestController
public class TestController {

    private static DataSourceProperties dataSourceProperties;

    @Autowired
    public void setDataSourceProperties(DataSourceProperties dataSourceProperties){
        TestController.dataSourceProperties = dataSourceProperties;
    }

    private MysqlVisitServiceImpl mysqlVisitService;

    @Autowired
    public TestController(MysqlVisitServiceImpl mysqlVisitService){
        this.mysqlVisitService = mysqlVisitService;
    }

    @GetMapping("/static")
    public String getStaticProperty() {
        return MysqlVisitServiceImpl.getDatasource().toString();
    }
}

package com.paprika.jdbc.service.impl;

import com.paprika.jdbc.domain.DataSourceInfoDto;
import lombok.extern.slf4j.Slf4j;
import com.paprika.jdbc.service.DatabaseVisit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author adam
 * @date 2019/4/25 12:28
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
@Slf4j
public abstract class AbstractDatabaseVisitImpl implements DatabaseVisit {

    private Connection conn;

    @Override
    public void conn(DataSourceInfoDto dataSourceInfoDto){
        try {
            Class.forName(dataSourceInfoDto.getClassName());
            conn = DriverManager.getConnection(dataSourceInfoDto.getUrl(), dataSourceInfoDto.getUser(), dataSourceInfoDto.getPwd());
        }catch (Exception e){
            log.error(e.getMessage());
        }
    }

    @Override
    public void closeConnection(){
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            log.error("关闭db连接异常：{}", e.getMessage());
            throw new RuntimeException("关闭资源连接失败");
        }
    }

}

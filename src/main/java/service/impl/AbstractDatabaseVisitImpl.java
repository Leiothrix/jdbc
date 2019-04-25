package service.impl;

import domain.DataSourceInfoDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.DatabaseVisit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author adam
 * @date 2019/4/25 12:28
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public abstract class AbstractDatabaseVisitImpl implements DatabaseVisit {

    private static final Logger logger = LoggerFactory.getLogger(AbstractDatabaseVisitImpl.class.getName());

    private Connection conn;

    @Override
    public void conn(DataSourceInfoDto dataSourceInfoDto){
        try {
            Class.forName(dataSourceInfoDto.getClassName());
            conn = DriverManager.getConnection(dataSourceInfoDto.getUrl(), dataSourceInfoDto.getUser(), dataSourceInfoDto.getPwd());
        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }

    @Override
    public void closeConnection(){
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            logger.error("关闭db连接异常：{}", e.getMessage());
            throw new RuntimeException("关闭资源连接失败");
        }
    }

}

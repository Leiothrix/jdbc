import domain.DataSourceInfoDto;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.impl.SQLServerVisitServiceImpl;

/**
 * @author adam
 * @date 2019/4/25 15:31
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class TestSQLServer {

    private static final Logger logger = LoggerFactory.getLogger(TestSQLServer.class.getName());

    private DataSourceInfoDto dataSourceInfoDto = new DataSourceInfoDto();

    @Test
    public void teseConn(){
        SQLServerVisitServiceImpl sqlServerVisitService = new SQLServerVisitServiceImpl();
        dataSourceInfoDto.setClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSourceInfoDto.setUrl("jdbc:sqlserver://127.0.0.1:1433;databaseName=DWQueue");
        dataSourceInfoDto.setUser("sa");
        dataSourceInfoDto.setPwd("123456");
        sqlServerVisitService.conn(dataSourceInfoDto);
        sqlServerVisitService.closeConnection();
    }
}

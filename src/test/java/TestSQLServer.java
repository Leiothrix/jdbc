import com.paprika.jdbc.domain.DataSourceInfoDto;
import org.junit.Test;
import com.paprika.jdbc.service.impl.SQLServerVisitServiceImpl;

/**
 * @author adam
 * @date 2019/4/25 15:31
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class TestSQLServer{


    private DataSourceInfoDto dataSourceInfoDto = new DataSourceInfoDto();

    @Test
    public void testConn(){
        SQLServerVisitServiceImpl sqlServerVisitService = new SQLServerVisitServiceImpl();
        dataSourceInfoDto.setClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSourceInfoDto.setUrl("jdbc:sqlserver://127.0.0.1:1433;databaseName=DWQueue");
        dataSourceInfoDto.setUser("sa");
        dataSourceInfoDto.setPwd("123456");
        sqlServerVisitService.conn(dataSourceInfoDto);
        sqlServerVisitService.closeConnection();
    }
}

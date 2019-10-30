import com.paprika.jdbc.domain.DataSourceInfoDto;
import org.junit.Test;
import com.paprika.jdbc.service.impl.OracleVisitServiceImpl;

/**
 * @author adam
 * @date 2019/4/25 15:31
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class TestOracle{

    private DataSourceInfoDto dataSourceInfoDto = new DataSourceInfoDto();

    @Test
    public void testConn(){
        OracleVisitServiceImpl oracleVisitService = new OracleVisitServiceImpl();
        dataSourceInfoDto.setClassName("oracle.jdbc.driver.OracleDriver");
        dataSourceInfoDto.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:orcl");
        dataSourceInfoDto.setUser("system");
        dataSourceInfoDto.setPwd("123456");
        oracleVisitService.conn(dataSourceInfoDto);
        oracleVisitService.closeConnection();
    }
}

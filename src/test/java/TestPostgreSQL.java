import com.paprika.jdbc.domain.DataSourceInfoDto;
import org.junit.Test;
import com.paprika.jdbc.service.impl.PostgreSQLVisitServiceImpl;

/**
 * @author adam
 * @date 2019/4/25 15:31
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class TestPostgreSQL{

    private DataSourceInfoDto dataSourceInfoDto = new DataSourceInfoDto();

    @Test
    public void testConn(){
        PostgreSQLVisitServiceImpl postgreSQLVisitService = new PostgreSQLVisitServiceImpl();
        dataSourceInfoDto.setClassName("org.postgresql.Driver");
        dataSourceInfoDto.setUrl("jdbc:postgresql://127.0.0.1:5432/postgres");
        dataSourceInfoDto.setUser("adam");
        dataSourceInfoDto.setPwd("123456");
        postgreSQLVisitService.conn(dataSourceInfoDto);
        postgreSQLVisitService.closeConnection();
    }
}

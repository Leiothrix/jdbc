import domain.DataSourceInfoDto;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.impl.PostgreSQLVisitServiceImpl;

/**
 * @author adam
 * @date 2019/4/25 15:31
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class TestPostgreSQL {

    private static final Logger logger = LoggerFactory.getLogger(TestPostgreSQL.class.getName());

    private DataSourceInfoDto dataSourceInfoDto = new DataSourceInfoDto();

    @Test
    public void teseConn(){
        PostgreSQLVisitServiceImpl postgreSQLVisitService = new PostgreSQLVisitServiceImpl();
        dataSourceInfoDto.setClassName("org.postgresql.Driver");
        dataSourceInfoDto.setUrl("jdbc:postgresql://127.0.0.1:5432/postgres");
        dataSourceInfoDto.setUser("adam");
        dataSourceInfoDto.setPwd("123456");
        postgreSQLVisitService.conn(dataSourceInfoDto);
        postgreSQLVisitService.closeConnection();
    }
}

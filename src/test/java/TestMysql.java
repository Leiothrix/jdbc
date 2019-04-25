import domain.DataSourceInfoDto;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.impl.MysqlVisitServiceImpl;

/**
 * @author adam
 * @date 2019/4/25 15:31
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class TestMysql {

    private static final Logger logger = LoggerFactory.getLogger(TestMysql.class.getName());

    private DataSourceInfoDto dataSourceInfoDto = new DataSourceInfoDto();

    @Test
    public void teseConn(){
        MysqlVisitServiceImpl mysqlVisitService = new MysqlVisitServiceImpl();
        dataSourceInfoDto.setClassName("com.mysql.jdbc.Driver");
        dataSourceInfoDto.setUrl("jdbc:mysql://127.0.0.1:3306/sys");
        dataSourceInfoDto.setUser("root");
        dataSourceInfoDto.setPwd("123456");
        mysqlVisitService.conn(dataSourceInfoDto);
        mysqlVisitService.closeConnection();
    }

}

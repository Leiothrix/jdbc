
import com.paprika.jdbc.App;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import com.paprika.jdbc.service.impl.MysqlVisitServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;

/**
 * @author adam
 * @date 2019/4/25 15:31
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class TestMysql{

    @Resource
    MysqlVisitServiceImpl mysqlVisitService;

    @Test
    public void testConn(){
        mysqlVisitService.conn(MysqlVisitServiceImpl.getDatasource());
        mysqlVisitService.closeConnection();
    }
}

import com.alibaba.fastjson.JSON;
import com.xyl.login.entity.LoginInfo;
import com.xyl.login.service.LoginInfoService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class MyBatisTest {
    private static Logger logger = Logger.getLogger(MyBatisTest.class);
    @Resource
    private LoginInfoService loginInfoService;

    @Test
    public void test1() {
        LoginInfo loginInfo = loginInfoService.queryById("admin");
        List<LoginInfo> userList = new ArrayList<>();
        userList = loginInfoService.queryAllByLimit(null,3);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(loginInfo));
        logger.info(JSON.toJSONString(userList));
    }


}

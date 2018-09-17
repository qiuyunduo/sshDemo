package rankservicetest;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IRankService;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:10 18-9-14
 * @Modified: null
 */
public class RankServiceTest {
    private ApplicationContext applicationContext;
    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    }
    @Test
    public void test(){
        IRankService rankService = applicationContext.getBean(IRankService.class);
        rankService.test();
    }
}

package cn.mangodb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mangodb.message.HelloSender;

/**
* @author xiang
* @date 2019/01/04
*/
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitMQ {
    @Autowired
    private HelloSender helloSender;

    @Test
    public void testRabbit() throws Exception {
       // helloSender.send();
        helloSender.sendObject();

    }
}

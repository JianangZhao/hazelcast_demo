package org.example.message;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AMQMessageServiceTest {
    @Autowired
    private AMQMessageService amqMessageService;
    @Test
    public void sendmessage() {
        String message = "陈老老老板";
        amqMessageService.sendMsg(message);
    }

    //这个是手动消费，如果使用了监听器就会自动消费
    @Test
    public void domessage() {
        amqMessageService.doMsg();
    }
}

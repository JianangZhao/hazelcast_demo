package org.example.conpontent;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class AMQMessageListener {

    @JmsListener(destination = "order.queue.message")
    private void received(String msg){
        System.out.println("自动收到的消息是："+msg);
    }
}

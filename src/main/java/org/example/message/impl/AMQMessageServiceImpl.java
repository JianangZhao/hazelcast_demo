package org.example.message.impl;


import org.example.message.AMQMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class AMQMessageServiceImpl implements AMQMessageService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Override
    public void sendMsg(String msg) {
        System.out.println("发送的消息是：" + msg);
        jmsMessagingTemplate.convertAndSend("order.queue.message", msg);
    }

    @Override
    public String doMsg() {
        String msg = jmsMessagingTemplate.receiveAndConvert("order.queue.message", String.class);
        System.out.println("接收到消息是："+msg);
        return msg;
    }
}

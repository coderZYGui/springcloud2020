package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/9/2 20:38
 */
@Controller
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT) // 监听输入源
    public void input(Message<String> message) {
        System.out.println("2号消费者，接收：" + message.getPayload() + "\t port:" + serverPort);
    }
}

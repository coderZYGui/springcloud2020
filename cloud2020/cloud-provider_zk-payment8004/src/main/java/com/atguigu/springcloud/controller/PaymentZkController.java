package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/8/22 08:56
 */
@RestController
@Slf4j
public class PaymentZkController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/zk")
    public String paymentZk() {
        return "SpringCloud with Zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}

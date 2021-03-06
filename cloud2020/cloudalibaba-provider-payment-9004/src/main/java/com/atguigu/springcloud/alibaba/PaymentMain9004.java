package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/9/9 20:13
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9004.class, args);
    }
}

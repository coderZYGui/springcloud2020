package com.atguigu.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/9/3 18:18
 */
@RestController
public class OrderNacosController {

    public static final String PAYMENT_URL = "http://nacos-payment-provider";

    @Resource
    private RestTemplate restTemplate;

//    @Value("${service-url.nacos-user-service")
//    private String serverURL; // 相当于不用写 public static final String PAYMENT_URL; 从配置文件中读取

    @GetMapping("/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/nacos/" + id, String.class);
    }
}


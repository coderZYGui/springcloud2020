package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/8/30 15:45
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")	//spring的@Value注解, github上config.info的信息
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return "serverPort: " + serverPort + "------ configInfo: " + configInfo;
    }
}

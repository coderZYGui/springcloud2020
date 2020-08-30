package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/8/30 14:31
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClietnMain3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClietnMain3355.class, args);
    }
}

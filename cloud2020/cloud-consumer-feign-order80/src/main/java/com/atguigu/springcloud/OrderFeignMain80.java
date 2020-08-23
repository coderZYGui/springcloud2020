package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/8/23 11:44
 */
@SpringBootApplication
@EnableFeignClients //该注解的作用是扫描标记了@FeignClient的接口并创建实例bean,默认扫描并创建所在工程下的包
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}

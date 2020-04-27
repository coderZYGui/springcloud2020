package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 *
 * @author zygui
 * @date Created on 2020/4/27 21:19
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

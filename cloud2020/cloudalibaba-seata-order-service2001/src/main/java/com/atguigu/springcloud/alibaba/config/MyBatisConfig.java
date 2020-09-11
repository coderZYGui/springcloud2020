package com.atguigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/9/10 15:13
 */
@MapperScan("com.angenin.springcloud.dao")
@Configuration
public class MyBatisConfig {
}


package com.atguigu.springcloud.alibaba.service;

import java.math.BigDecimal;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/9/10 14:45
 */
public interface AccountService {

    void decrease(Long userId, BigDecimal money);
}



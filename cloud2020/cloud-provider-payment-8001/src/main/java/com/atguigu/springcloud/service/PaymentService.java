package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Description:
 *
 * @author zygui
 * @date Created on 2020/4/27 20:12
 */
public interface PaymentService {
    // 新增
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

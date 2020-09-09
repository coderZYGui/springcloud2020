package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/9/9 20:52
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回，---PaymentFallbackService", new Payment(id, "ErrorSerial"));
    }
}
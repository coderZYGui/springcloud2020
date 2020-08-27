package com.atguigu.springclout.service;

import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/8/27 17:21
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fallback-paymentInfo_OK----";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fallback-paymentInfo_TimeOut----";
    }
}

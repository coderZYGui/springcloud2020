package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/8/23 11:46
 */

// 这里是找到这个: CLOUD-PAYMENT-SERVICE下的/payment/get/{id}这个地址
@FeignClient(value = "CLOUD-PAYMENT-SERVICE") //添加@FeignClient注解,指定服务提供方服务名称
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

}

package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.alibaba.handler.CustomerBlockHandler;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/9/9 16:37
 */
@RestController
public class RateLimitController {

    // 按资源名称(byResource)来进行限流
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult byResource() {
        return new CommonResult(200, "按照资源名称限流测试", new Payment(2020L, "serial001"));
    }

    //兜底方法
    public CommonResult handleException(BlockException exception) {
        return new CommonResult(444, exception.getClass().getCanonicalName() + "\t 服务不可用");
    }

    // 按url(/rateLimit/byUrl)来进行限流
    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")    //没有兜底方法，系统就用默认的
    public CommonResult byUrl() {
        return new CommonResult(200, "按照byUrl限流测试", new Payment(2020L, "serial002"));
    }

    //按照自定义限流处理逻辑 CustomerBlockHandler
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException")
    public CommonResult customerBlockHandler() {
        return new CommonResult(200, "按照客户自定义限流测试", new Payment(2020L, "serial003"));
    }

}


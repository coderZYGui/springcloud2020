package com.atguigu.springcloud.alibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/9/9 16:58
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444, "按照客户自定义限流测试，Glogal handlerException ---- 1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "按照客户自定义限流测试，Glogal handlerException ---- 2");
    }
}


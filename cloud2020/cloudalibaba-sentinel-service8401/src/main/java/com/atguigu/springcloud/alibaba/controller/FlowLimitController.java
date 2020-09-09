package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/9/7 15:20
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() throws InterruptedException {
        // TimeUnit.MILLISECONDS.sleep(6000); // 用来测试Sentinel的线程数阈值
        return "----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "----testB";
    }

    @GetMapping("/testD")
    public String testD() {

        // 测试 RT 熔断降级
        /*try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testD 测试RT");*/

        // 测试 异常比例 熔断降级
        /*log.info("testD 测试异常比例");
        int age = 10 / 0;*/

        // 测试 异常数 熔断降级
        log.info("testD 测试异常数");
        int age = 10 / 0;
        return "----testD";
    }

    @GetMapping("/testC")
    @SentinelResource(value = "testC", blockHandler = "deal_testC") //此处value值，一般为@GetMapping属性值去掉斜杠
    public String testC(@RequestParam(value = "id", required = false) Integer id,
                        @RequestParam(value = "name", required = false) String name) {
        return "-----testC";
    }
    // 兜底方法
    public String deal_testC(Integer id, String name, BlockException exception) {
        // sentinel的默认提示都是： Blocked by Sentinel (flow limiting)
        return "----deal_testHotKey, o(╥﹏╥)o";
    }

}


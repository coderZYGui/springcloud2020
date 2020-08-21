package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author zygui
 * @date Created on 2020/4/27 19:49
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;        //泛型，对应类型的json数据

    public CommonResult(Integer code, String message) {
        this(code, message, null);  // 调用全参构造方法
    }
}

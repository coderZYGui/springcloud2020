package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description:
 *
 * @author zygui
 * @date Created on 2020/4/27 19:56
 */
@Mapper
public interface PaymentDao {

    // 新增
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

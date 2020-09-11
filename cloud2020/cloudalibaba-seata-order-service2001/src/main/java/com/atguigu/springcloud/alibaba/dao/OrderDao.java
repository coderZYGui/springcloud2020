package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/9/10 14:35
 */
@Mapper
public interface OrderDao {

    //1 新建订单
    int create(Order order);

    //2 修改订单状态,从0改为1
    int update(@Param("userId") Long userId, @Param("status") Integer status);

}

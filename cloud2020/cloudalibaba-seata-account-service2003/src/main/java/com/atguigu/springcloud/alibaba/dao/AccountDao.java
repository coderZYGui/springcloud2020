package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/9/10 14:35
 */
@Mapper
public interface AccountDao {
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}


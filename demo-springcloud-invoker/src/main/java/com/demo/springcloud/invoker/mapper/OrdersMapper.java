package com.demo.springcloud.invoker.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.demo.springcloud.invoker.model.Orders;

@Mapper
public interface OrdersMapper {
    int deleteByPrimaryKey(String id);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}
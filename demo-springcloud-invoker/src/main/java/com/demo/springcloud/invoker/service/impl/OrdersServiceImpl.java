package com.demo.springcloud.invoker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springcloud.invoker.mapper.OrdersMapper;
import com.demo.springcloud.invoker.model.Orders;
import com.demo.springcloud.invoker.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	private OrdersMapper ordersMapper;

	@Override
	public Orders selectByPrimaryKey(String id) {
		return ordersMapper.selectByPrimaryKey(id);
	}
	
	
	
}

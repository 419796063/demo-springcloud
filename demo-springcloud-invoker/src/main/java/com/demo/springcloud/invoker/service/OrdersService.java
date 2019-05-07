package com.demo.springcloud.invoker.service;

import com.demo.springcloud.invoker.model.Orders;

public interface OrdersService {
	Orders selectByPrimaryKey(String id);
}

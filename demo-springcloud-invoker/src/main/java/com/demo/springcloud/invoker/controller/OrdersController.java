package com.demo.springcloud.invoker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.springcloud.invoker.service.OrdersService;
import com.demo.springcloud.utils.response.ResponseTemplate;
import com.demo.springcloud.utils.response.ResponseTemplateUtils;

@Controller
@RequestMapping
public class OrdersController {

	@Autowired
	private OrdersService orderService;

	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	@ResponseBody
	public ResponseTemplate selectByPrimaryKey(String id) {
		try {
			return ResponseTemplateUtils.getResponseTemplateWithObject(orderService.selectByPrimaryKey(id));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseTemplateUtils.RESPONSE_TEMPLATE_UNKNOWN_EXCEPTION;
		}
	}
	
}

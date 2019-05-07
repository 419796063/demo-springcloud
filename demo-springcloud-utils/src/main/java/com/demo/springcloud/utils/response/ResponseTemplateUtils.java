package com.demo.springcloud.utils.response;

import java.util.HashMap;
import java.util.Map;

public class ResponseTemplateUtils {
	// 请求成功
	public static ResponseTemplate getResponseTemplateWithObject(Object data) {
		return new ResponseTemplate("20000", "请求成功", data);
	}
	
	public static final ResponseTemplate RESPONSE_TEMPLATE_UNKNOWN_EXCEPTION = new ResponseTemplate("20001", "请求成功", "未知异常");
	public static final ResponseTemplate RESPONSE_TEMPLATE_TOKEN_LOSE = new ResponseTemplate("20002", "请求成功", "token失效");
	public static final ResponseTemplate RESPONSE_TEMPLATE_NO_POWER = new ResponseTemplate("20003", "请求成功", "没有权限，请先登录");
	public static final ResponseTemplate RESPONSE_TEMPLATE_NO_TOKEN = new ResponseTemplate("20004", "请求成功", "token值不存在");
	public static final ResponseTemplate RESPONSE_TEMPLATE_STOCK_IS_NOT_INTEGER = new ResponseTemplate("20005", "请求成功", "库存只能为整数类型");
	
	public static Map<String, ResponseTemplate> map = new HashMap<String, ResponseTemplate>();
	static {
		map.put("null", new ResponseTemplate("30001", "请求成功", "缺少必填参数"));
		
	}
	
	public static Map<String, ResponseTemplate> validateIsEmpty(String...strs) {
		Map<String, ResponseTemplate> validateResult = new HashMap<>();
		String str = null;
		String[] split = null;
		for (int i = 0; i < strs.length; i++) {
			str = strs[i];
			split = str.split(":");
			if(split.length == 1) {
				validateResult.put("validateResult", ResponseTemplateUtils.map.get(split[0]));
				return validateResult;
			} else {
				if(split[1] == null || "null".equals(split[1]) || split[1] == "") {
					validateResult.put("validateResult", ResponseTemplateUtils.map.get(split[0]));
					return validateResult;
				}
			}
		}
		validateResult.put("validateResult", null);
		return validateResult;
	}
	
}

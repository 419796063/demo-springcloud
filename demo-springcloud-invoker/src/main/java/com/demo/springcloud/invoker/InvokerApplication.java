package com.demo.springcloud.invoker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.demo.springcloud.invoker")
@MapperScan(basePackages = "com.demo.springcloud.invoker.mapper")
@EnableEurekaClient
@SpringBootApplication
public class InvokerApplication {
	public static void main(String[] args) {
		SpringApplication.run(InvokerApplication.class, args);
	}
}

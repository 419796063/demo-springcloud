package com.demo.springcloud.invoker.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    private String id;

    private String productId;

    private String num;

    private Date createTime;

}
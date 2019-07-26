package com.spring.ioc.service.impl;

import com.spring.ioc.annotation.ExtResource;
import com.spring.ioc.annotation.ExtService;
import com.spring.ioc.service.OrderService;

@ExtService
public class UserServiceImpl {

    @ExtResource
    private OrderService orderServiceImpl;       //不能用orderService只能用orderServiceImpl，需改进

    public void  addUser(){
        orderServiceImpl.addOrder();
        System.out.println("使用反射机制初始化对象");
    }
}

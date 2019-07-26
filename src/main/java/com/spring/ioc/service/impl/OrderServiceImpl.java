package com.spring.ioc.service.impl;

import com.spring.ioc.annotation.ExtService;
import com.spring.ioc.service.OrderService;

@ExtService
public class OrderServiceImpl implements OrderService {

    @Override
    public void addOrder() {
        System.out.println("addOrder");
    }
}

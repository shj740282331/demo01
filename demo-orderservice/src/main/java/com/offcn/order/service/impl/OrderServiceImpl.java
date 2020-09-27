package com.offcn.order.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String getOrderListByUserId(Long userId) {
        return "{'userId':"+userId+",'order:':'订单001'}";
    }
}

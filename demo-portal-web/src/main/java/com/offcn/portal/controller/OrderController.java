package com.offcn.portal.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.offcn.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController    // @RestController == @Controller + @ResponseBody   User--->json
@RequestMapping("/order")
public class OrderController {

//    @Autowired
    //设置超时时间 10 秒
    @Reference(timeout = 10000) // orderService类型的对象，是通过远程调用的
    OrderService orderService;

    // http://localhost:8082/order/getOrderByUserId.do
    @RequestMapping("/getOrderByUserId")
    public String getOrderByUserId(Long userId){
        return orderService.getOrderListByUserId(userId);
    }

}

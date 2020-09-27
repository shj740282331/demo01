package com.offcn.order.service;

public interface OrderService {
    /**
     * 根据用户id查询订单
     * @param userId
     * @return
     */
    public String getOrderListByUserId(Long userId);
}

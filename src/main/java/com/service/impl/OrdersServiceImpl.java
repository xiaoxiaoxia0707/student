package com.service.impl;

import com.mapper.OrdersMapper;
import com.pojo.Orders;
import com.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/3/21.
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersMapper ordersMapper;
    @Override
    public boolean addOrder(Orders orders) {
        return ordersMapper.insert(orders)>0?true:false;
    }
}

package com.service;

import com.pojo.Orders;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/17.
 */
@Service
public interface OrdersService {
    boolean addOrder(Orders orders);
}

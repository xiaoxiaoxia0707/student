package com.mapper;

import com.pojo.Orders;

public interface OrdersMapper {
    int insert(Orders record);

    int insertSelective(Orders record);
}
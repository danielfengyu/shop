package com.daniel.shop.dao;

import com.daniel.shop.entities.OrderList;
import com.daniel.shop.entities.OrderListKey;

public interface OrderListMapper {
    int deleteByPrimaryKey(OrderListKey key);

    int insert(OrderList record);

    int insertSelective(OrderList record);

    OrderList selectByPrimaryKey(OrderListKey key);

    int updateByPrimaryKeySelective(OrderList record);

    int updateByPrimaryKey(OrderList record);
}
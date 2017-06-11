package com.daniel.shop.dao;

import java.util.List;

import com.daniel.shop.entities.Customer;
import com.daniel.shop.entities.CustomerKey;

public interface CustomerMapper {
    int deleteByPrimaryKey(CustomerKey key);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(CustomerKey key);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

	List<Customer> queryAll();
}
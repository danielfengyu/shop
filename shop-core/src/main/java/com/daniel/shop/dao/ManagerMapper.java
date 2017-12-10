package com.daniel.shop.dao;

import com.daniel.shop.entities.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(String userId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}
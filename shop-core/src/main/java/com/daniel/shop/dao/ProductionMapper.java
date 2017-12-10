package com.daniel.shop.dao;

import com.daniel.shop.entities.Production;
import com.daniel.shop.entities.ProductionKey;

public interface ProductionMapper {
    int deleteByPrimaryKey(ProductionKey key);

    int insert(Production record);

    int insertSelective(Production record);

    Production selectByPrimaryKey(ProductionKey key);

    int updateByPrimaryKeySelective(Production record);

    int updateByPrimaryKey(Production record);
}
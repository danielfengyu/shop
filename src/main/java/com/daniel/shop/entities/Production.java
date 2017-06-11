package com.daniel.shop.entities;

import java.util.Date;

public class Production extends ProductionKey {
    private Double productionInValue;

    private Double productionOutValue;

    private Integer productionNum;

    private Date stockTime;

    private Date soldTime;

    public Double getProductionInValue() {
        return productionInValue;
    }

    public void setProductionInValue(Double productionInValue) {
        this.productionInValue = productionInValue;
    }

    public Double getProductionOutValue() {
        return productionOutValue;
    }

    public void setProductionOutValue(Double productionOutValue) {
        this.productionOutValue = productionOutValue;
    }

    public Integer getProductionNum() {
        return productionNum;
    }

    public void setProductionNum(Integer productionNum) {
        this.productionNum = productionNum;
    }

    public Date getStockTime() {
        return stockTime;
    }

    public void setStockTime(Date stockTime) {
        this.stockTime = stockTime;
    }

    public Date getSoldTime() {
        return soldTime;
    }

    public void setSoldTime(Date soldTime) {
        this.soldTime = soldTime;
    }
}
package com.daniel.shop.entities;

import java.util.Date;

public class OrderList extends OrderListKey {
    private Integer soldNum;

    private Double productionOneValue;

    private Double productionAllValue;

    private Date soldTime;

    private Float discountPrice;

    private String isPay;

    private Date payTime;

    private String descrip;

    public Integer getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    public Double getProductionOneValue() {
        return productionOneValue;
    }

    public void setProductionOneValue(Double productionOneValue) {
        this.productionOneValue = productionOneValue;
    }

    public Double getProductionAllValue() {
        return productionAllValue;
    }

    public void setProductionAllValue(Double productionAllValue) {
        this.productionAllValue = productionAllValue;
    }

    public Date getSoldTime() {
        return soldTime;
    }

    public void setSoldTime(Date soldTime) {
        this.soldTime = soldTime;
    }

    public Float getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay == null ? null : isPay.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip == null ? null : descrip.trim();
    }
}
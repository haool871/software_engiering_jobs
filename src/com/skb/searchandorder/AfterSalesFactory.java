package com.skb.searchandorder;

public class AfterSalesFactory extends com.skb.searchandorder.AbstractFactory{
    public AfterSalesFactory(){
    }

    public com.skb.searchandorder.Order getOrder() {
        return new com.skb.searchandorder.Order();
    }

    public com.skb.searchandorder.Notice getNotice() {
        return null;
    }

    public com.skb.searchandorder.Group getGroup() {
        return null;
    }

    public com.skb.searchandorder.AbstractShop getShop() {
        return null;
    }
}

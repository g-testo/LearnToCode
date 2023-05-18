package com.order;

public class OnlineOrder extends Order{
    private String shippingAddress;

    public OnlineOrder(int id, String shippingAddress){
        super(id);
        this.shippingAddress = shippingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "OnlineOrder{" +
                "shippingAddress='" + shippingAddress + '\'' +
                "items=" + super.getItems() +
                '}';
    }
}

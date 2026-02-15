package com.ecommerce.service;
import com.ecommerce.model.Order;
import com.ecommerce.store.OrderStore;

public class Summing {
    private OrderStore store;
    public Summing(OrderStore store) { this.store = store; }

    public double totalMoney() {
        return store.all().stream().mapToDouble(Order::finalPrice).sum();
    }
}
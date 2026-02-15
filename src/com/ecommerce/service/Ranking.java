package com.ecommerce.service;
import com.ecommerce.model.Order;
import com.ecommerce.store.OrderStore;
import java.util.Map;
import java.util.stream.Collectors;

public class Ranking {
    private OrderStore store;
    public Ranking(OrderStore store) { this.store = store; }

    public String topItem() {
        return store.all().stream()
                .collect(Collectors.groupingBy(o -> o.itemId, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No data");
    }
}
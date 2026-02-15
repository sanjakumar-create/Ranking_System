package com.ecommerce.store;

import com.ecommerce.model.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderStore {
    private List<Order> list = new ArrayList<>();

    // 1. CREATE
    public void add(Order o) {
        list.add(o);
    }

    // 2. READ
    public List<Order> all() {
        return list;
    }

    // 3. UPDATE (The "Change" operation)
    public void change(String id, Order newOrder) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id.equals(id)) {
                list.set(i, newOrder);
                System.out.println("System: Order " + id + " updated successfully.");
                return;
            }
        }
    }

    // 4. DELETE (The "Remove" operation)
    public void remove(String id) {
        boolean removed = list.removeIf(o -> o.id.equals(id));
        if (removed) {
            System.out.println("System: Order " + id + " deleted successfully.");
        }
    }
}
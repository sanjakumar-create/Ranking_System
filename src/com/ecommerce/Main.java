package com.ecommerce;
import com.ecommerce.service.*;
import com.ecommerce.model.Order;
import com.ecommerce.store.OrderStore;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize
        OrderStore store = new OrderStore();
        Summing summing = new Summing(store);
        Ranking ranking = new Ranking(store);
        App dashboard = new App(summing, ranking);

        // 2. CREATE (Add T1, T2, T3)
        store.add(new Order("001", "Laptop", 1, 1000, 50, LocalDateTime.now()));
        store.add(new Order("002", "Mouse", 10, 20, 5, LocalDateTime.now()));
        store.add(new Order("001", "Mouse", 7, 1000, 50, LocalDateTime.now()));
        store.add(new Order("002", "Mouse", 23, 20, 5, LocalDateTime.now()));
        store.add(new Order("002", "Laptop", 1, 1000, 50, LocalDateTime.now()));
        store.add(new Order("002", "Mouse", 10, 20, 5, LocalDateTime.now()));
        store.add(new Order("001", "Mouse", 7, 1000, 50, LocalDateTime.now()));
        store.add(new Order("002", "Mouse", 23, 20, 5, LocalDateTime.now()));

        System.out.println("Initial Report:");
        dashboard.showReport();

        // 3. UPDATE (Change Order 002)
        Order updatedMouseOrder = new Order("002", "Mouse", 20, 20, 10, LocalDateTime.now());
        store.change("002", updatedMouseOrder);

        // 4. DELETE (Remove Order 001)
        store.remove("001");

        // 5. READ (Final Report)
        System.out.println("\nReport after Update and Delete:");
        dashboard.showReport();
    }
}
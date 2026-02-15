package com.ecommerce.model;
import java.time.LocalDateTime;

public class Order {
    public String id;         // Order ID
    public String itemId;     // Product Name/ID
    public int count;         // Quantity (5, 10, 20 from your notes)
    public double price;      // Unit Price ($50, $100 from your notes)
    public double discount;   // Discount amount
    public LocalDateTime date;

    public Order(String id, String itemId, int count, double price, double discount, LocalDateTime date) {
        this.id = id;
        this.itemId = itemId;
        this.count = count;
        this.price = price;
        this.discount = discount;
        this.date = date;
    }

    // This is the Σ T logic: (Quantity * Price) - Discount
    public double finalPrice() {
        return (count * price) - discount;
    }
}
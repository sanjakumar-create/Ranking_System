package com.ecommerce;
import com.ecommerce.service.*;

public class App {
    private Summing summing;
    private Ranking ranking;

    public App(Summing summing, Ranking ranking) {
        this.summing = summing;
        this.ranking = ranking;
    }

    public void showReport() {
        System.out.println("\n--- BUSINESS REPORT ---");
        System.out.println("Total Sales (Σ T): $" + summing.totalMoney());
        System.out.println("Most Frequent Item: " + ranking.topItem());
        System.out.println("------------------------");
    }
}
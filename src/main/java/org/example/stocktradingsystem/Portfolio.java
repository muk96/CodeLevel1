package org.example.stocktradingsystem;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private final Map<Stock, Integer> stocks;

    public Portfolio() {
        stocks = new HashMap<>();
    }

    public void buyStock(Stock stock, int quantity) {
        stocks.put(stock, stocks.getOrDefault(stock, 0) + quantity);
    }

    public void sellStock(Stock stock, int quantity) {
        int currentQuantity = stocks.getOrDefault(stock, 0);
        if (currentQuantity >= quantity) {
            stocks.put(stock, currentQuantity - quantity);
        } else {
            throw new IllegalArgumentException("Not enough stocks to sell.");
        }
    }

    public void displayPortfolio() {
        System.out.println("Portfolio:");
        for (Map.Entry<Stock, Integer> entry : stocks.entrySet()) {
            Stock stock = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(stock.getSymbol() + " - " + stock.getName() + " (" + quantity + ")");
        }
        System.out.println();
    }
}


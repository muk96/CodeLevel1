package org.example.stocktradingsystem;

import java.util.HashMap;
import java.util.Map;

public class User {
    private final String name;
    private final long userId;
    private double accountBalance = 0.0;

    private Map<String, Integer> myShares;

    public User(String name, long userId){
        this.name = name;
        this.userId = userId;
        myShares = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public long getUserId() {
        return userId;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public Map<String, Integer> getMyShares() {
        return myShares;
    }
}

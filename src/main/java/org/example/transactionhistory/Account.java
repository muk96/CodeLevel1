package org.example.transactionhistory;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final String name;
    private final long acctNo;
    private double acctBalance = 0;

    TransactionHistory transactionHistory;

    public Account(String name, long acctNo) {
        this.name = name;
        this.acctNo = acctNo;
        transactionHistory = TransactionHistory.getTransactionHistory();
        transactionHistory.getRecords().put(this, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public long getAcctNo() {
        return acctNo;
    }

    public double getAcctBalance() {
        return acctBalance;
    }

    public void deposit(int amount){
        acctBalance += amount;
        List<String> list = transactionHistory.getRecords().get(this);
        list.add("Deposit : " + amount);
        transactionHistory.getRecords().put(this, list);
    }

    public void withdrawal(int amount){
        if(amount > acctBalance){
            System.out.println("You don't have that much money!");
            return;
        }
        acctBalance -= amount;
        List<String> list = transactionHistory.getRecords().get(this);
        list.add( "Withdrawal : " + amount);
        transactionHistory.getRecords().put(this,list);
    }

}

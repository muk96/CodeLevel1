package org.example.transactionhistory;

import java.util.HashMap;
import java.util.List;

public class TransactionHistory {
    private static final TransactionHistory transactionHistory = new TransactionHistory();

    private HashMap<Account, List<String>> records;

    private TransactionHistory(){
        records = new HashMap<>();
    }

    public static TransactionHistory getTransactionHistory(){
        return transactionHistory;
    }

    public HashMap<Account, List<String>> getRecords() {
        return records;
    }

    public void printTransactionHistory(Account account){
        for (String str : records.get(account)) {
            System.out.println(account.getName() + " -> " + str);
        }
    }

}

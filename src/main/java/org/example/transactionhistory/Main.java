package org.example.transactionhistory;

public class Main {
    public static void main(String[] args){
        Account account1 = new Account("Mukul", 124507);
        account1.deposit(100);
        account1.deposit(4322);
        account1.withdrawal(1000);
        account1.deposit(10);
        account1.transactionHistory.printTransactionHistory(account1);

        Account account2 = new Account("Madhu", 110007);
        account2.deposit(19999);
        account2.deposit(300);
        account2.deposit(1000);
        account2.withdrawal(2387);
        account2.transactionHistory.printTransactionHistory(account2);
    }
}

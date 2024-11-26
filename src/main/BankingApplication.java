package main;

import main.Account;

public class BankingApplication {
    public static void main(String[] args){
        Account account = new Account("test@email","testuser", 1000.0);

        account.deposit(1000.0);
        account.withdraw(100.0);
    }
}

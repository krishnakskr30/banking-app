package main;

public class BankingApplication {
    public static void main(String[] args){
        Account account = new Account("test@email","testuser");

        account.deposit(1000.0);
        account.withdraw(100.0);
    }
}

package main;

public class Account {
    private final String email;
    private final String name;
    private Double balance;

    public Account(String email, String name, Double balance) {
        this.email = email;
        this.name = name;
        this.balance = balance;
    }

    public Double deposit(Double amount) {
        return this.balance += amount;
    }

    public Double withdraw(Double amount) {
        return this.balance -= amount;
    }

}

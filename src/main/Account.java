package main;

public class Account {
    private final String email;
    private final String name;
    private Double balance;
    private Tier tier;

    public Account(String email, String name) {
        this.email = email;
        this.name = name;
        this.balance = 0.0;
        this.tier = Tier.SILVER;
    }

    private void updateTier() {
        if (balance >= 80000.0 && balance <= 100000.0) {
            this.tier = Tier.GOLD;
        } else if (balance > 100000.0) {
            this.tier = Tier.PLATINUM;
        } else {
            this.tier = Tier.SILVER;
        }
    }

    public Double deposit(Double amount) {
        this.balance += amount;
        updateTier();
        return this.balance;
    }

    public Double withdraw(Double amount) {
        this.balance -= amount;
        updateTier();
        return this.balance;
    }

    public Tier getTier() {
        return this.tier;
    }
}

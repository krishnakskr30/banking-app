package test;

import main.Account;
import main.Tier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void shouldDepositMoney() {
        Account account = new Account("test", "test");

        assertEquals(1000.0,account.deposit(1000.0));
    }

    @Test
    void shouldWithdrawMoney() {
        Account account = new Account("test", "test");
        account.deposit(100.0);

        assertEquals(90.0,account.withdraw(10.0));
    }

    @Test
    void shouldHaveDefaultSilverTierWhenAccountIsCreated() {
        Account account = new Account("test", "test");

        assertEquals(Tier.SILVER,account.getTier());
    }

    @Test
    void shouldReturnGoldTierWhenBalanceIsBetweenEightyThousandAndOneLakh() {
        Account account = new Account("test", "test");
        account.deposit(100000.0);

        assertEquals(Tier.GOLD,account.getTier());
    }
    @Test
    void shouldReturnPlatinumTierWhenBalanceIsAboveOneLakh() {
        Account account = new Account("test", "test");
        account.deposit(100001.0);

        assertEquals(Tier.PLATINUM,account.getTier());
    }
    @Test
    void shouldDowngradeToSilverTierWhenBalanceIsLessThanEightyThousandAfterWithdraw() {
        Account account = new Account("test", "test");
        account.deposit(100000.0);
        account.withdraw(50000.0);

        assertEquals(Tier.SILVER,account.getTier());
    }
}
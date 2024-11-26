package test;

import main.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void shouldDepositMoney() {
        Account account = new Account("test", "test", 100.0);

        assertEquals(1100.0,account.deposit(1000.0));
    }

    @Test
    void shouldWithdrawMoney() {
        Account account = new Account("test", "test", 100.0);

        assertEquals(90.0,account.withdraw(10.0));
    }
}
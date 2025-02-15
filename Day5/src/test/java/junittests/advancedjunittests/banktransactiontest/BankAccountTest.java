package junittests.advancedjunittests.banktransactiontest;

import junit.advancedjunit.testingbanktransaction.BankAccount;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

   BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0); // Initial balance of 100
    }

    @Test
    @DisplayName("Test deposit increases balance correctly")
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "Balance should be updated after deposit");
    }

    @Test
    @DisplayName("Test withdrawal decreases balance correctly")
    void testWithdraw() {
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance(), "Balance should be reduced after withdrawal");
    }

    @Test
    @DisplayName("Test withdrawal fails if insufficient funds")
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    @DisplayName("Test deposit fails with negative amount")
    void testDepositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    @DisplayName("Test withdraw fails with negative amount")
    void testWithdrawNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10.0));
        assertEquals("Insufficient funds", exception.getMessage());
    }
}

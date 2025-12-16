import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import com.skypay.Transaction;

public class AccountTest {

    @Test
    void testBankStatementWithSpecificDates() {
        TestableAccount account = new TestableAccount();

        account.deposit(1000, "10-01-2012");
        account.deposit(2000, "13-01-2012");
        account.withdraw(500, "14-01-2012");

        List<Transaction> transactions = account.getTransactions();

        assertEquals(3, transactions.size());

        // Check latest first
        assertEquals("14-01-2012", transactions.get(2).getDate());
        assertEquals(-500, transactions.get(2).getAmount());
        assertEquals(2500, transactions.get(2).getBalance());

        assertEquals("13-01-2012", transactions.get(1).getDate());
        assertEquals(2000, transactions.get(1).getAmount());
        assertEquals(3000, transactions.get(1).getBalance());

        assertEquals("10-01-2012", transactions.get(0).getDate());
        assertEquals(1000, transactions.get(0).getAmount());
        assertEquals(1000, transactions.get(0).getBalance());
    }
}
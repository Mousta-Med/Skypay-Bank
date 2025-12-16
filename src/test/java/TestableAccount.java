import com.skypay.Account;

class TestableAccount extends Account {
    public void deposit(int amount, String date) {
        super.deposit(amount);
        super.transactions.get(super.transactions.size() - 1).setDate(date);
    }

    public void withdraw(int amount, String date) {
        super.withdraw(amount);
        super.transactions.get(super.transactions.size() - 1).setDate(date);
    }
}

package Pertemuan4;
import java.time.LocalDate;

public class Deposit extends BankAccount {
    LocalDate expiry;

    public Deposit (String acctNumber, double balance, LocalDate expiry) {
        this.acctNumber = acctNumber;
        this.balance = balance;
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "Account Number: " + acctNumber + "\n" +
                "Balance: " + balance + "\n" +
                "Limit: " + expiry + "\n";
    }
}

package Pertemuan4;

public class Checking extends BankAccount {
    double limit;

    public Checking (String acctNumber, double balance, double limit) {
        this.acctNumber = acctNumber;
        this.balance = balance;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Account Number: " + acctNumber + "\n" +
                "Balance: " + balance + "\n" +
                "Limit: " + limit + "\n";
    }
}

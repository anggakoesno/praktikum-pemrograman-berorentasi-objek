package Pertemuan4;

public class BankAccount {
    String acctNumber;
    double balance;

    @Override
    public String toString() {
        return "Account Number: " + acctNumber + "\n" +
                "Balance: " + balance + "\n";
    }
}
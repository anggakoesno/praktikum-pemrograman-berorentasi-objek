package Pertemuan4;

public class Saving extends BankAccount {
    int transfers;

    public Saving (String acctNumber, double balance, int transfers) {
        this.acctNumber = acctNumber;
        this.balance = balance;
        this.transfers = transfers;
    }

    @Override
    public String toString() {
        return "Account Number: " + acctNumber + "\n" +
                "Balance: " + balance + "\n" +
                "Transfers: " + transfers + "\n";
    }
}

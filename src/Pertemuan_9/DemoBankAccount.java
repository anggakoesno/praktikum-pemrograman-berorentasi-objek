package Pertemuan_9;

public class DemoBankAccount {
    public static void main(String[] args) {
        BankAccount source = new BankAccount("A-101", 500000);
        BankAccount target = new BankAccount("B-202", 150000);
        double amount = 100000;

        try {
            source.transfer(amount, target);
            System.out.println("Transfer berhasil.");
            System.out.println("Saldo sumber (" + source.getAccountNumber() + ") = " + source.getBalance());
            System.out.println("Saldo target (" + target.getAccountNumber() + ") = " + target.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println("Error nominal: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error saldo: " + e.getMessage());
        } finally {
            System.out.println("Proses transfer selesai diperiksa dan dicatat.");
        }
    }
}


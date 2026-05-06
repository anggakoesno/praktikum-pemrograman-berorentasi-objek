package Pertemuan_9;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount (String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void transfer(double amount, BankAccount target)
            throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Nominal transfer harus lebih dari 0.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Saldo tidak mencukupi untuk transfer.");
        }

        balance -= amount; // ketika berhasil transfer, saldo dari akun bank yang melakukan transfer akan berkurang sejumlah nominal transfer
        target.balance += amount; // ketika berhasil transfer, saldo dari akun bank target akan bertambah sejumlah nominal transfer yang diberikan
    }
}

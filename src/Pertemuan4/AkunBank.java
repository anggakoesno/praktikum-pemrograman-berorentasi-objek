package Pertemuan4;

public class AkunBank {
    private String pemilik;
    private double saldo;

    public AkunBank(String pemilik, double saldoAwal) {
        this.pemilik = pemilik;
        this.saldo = saldoAwal;
    }

    public String getPemilik () {
        return pemilik;
    }

    public double getSaldo () {
        return saldo;
    }

    public void setSaldo (double saldoBaru) {
        if (saldoBaru >= 0) {
            this.saldo = saldoBaru;
            System.out.println("Saldo berhasil diperbarui.");
        } else {
            System.out.println("Saldo tidak boleh negatif!");
        }
    }

    public void deposit(double jumlahDeposit) {
        if (jumlahDeposit > 0) {
            this.saldo += jumlahDeposit;
            System.out.println("Deposit berhasil: Rp" + jumlahDeposit);
            System.out.println("Saldo Setelah Deposit: Rp" + getSaldo());
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0!");
        }
    }

    public void withdraw(double jumlahWithdraw) {
        if (jumlahWithdraw > 0 && jumlahWithdraw <= saldo) {
            this.saldo -= jumlahWithdraw;
            System.out.println("Penarikan berhasil: Rp" + jumlahWithdraw);
            System.out.println("Saldo Setelah Withdraw: Rp" + getSaldo());
        } else if (jumlahWithdraw > saldo) {
            System.out.println("Saldo tidak cukup untuk menarik Rp" + jumlahWithdraw);
        } else {
            System.out.println("Jumlah penarikan harus lebih dari 0!");
        }
    }
}

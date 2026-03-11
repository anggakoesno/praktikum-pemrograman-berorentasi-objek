package Pertemuan5_PBO;

public abstract class Emoney {
    protected String id;
    protected double balance;
    protected String edition;

    public Emoney(String id, double balance, String edition) {
        this.id = id;
        this.balance = balance;
        this.edition = edition;
    }

    public double topUp(int amount) {
        balance += amount;
        System.out.println("Berhasil top up sebesar: Rp" + amount);
        return balance;
    }

    public double topUp(double amount) {
        balance += amount;
        System.out.println("Berhasil top up sebesar: Rp" + amount);
        return balance;
    }

    public double pay(int amount) {
        balance -= amount;
        System.out.println("Berhasil membayar sebesar: Rp" + amount);
        return balance;
    }
}

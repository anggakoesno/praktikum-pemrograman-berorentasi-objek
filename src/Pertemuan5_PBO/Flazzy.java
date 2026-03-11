package Pertemuan5_PBO;

public class Flazzy extends Emoney{
    private double extraTopUp = 0.1;

    public Flazzy(String id, double balance, String edition) {
        super(id, balance, edition);
    }

    @Override
    public double topUp(int amount) {
        double extra = amount * extraTopUp;
        balance += amount + extra;
        System.out.println("Berhasil top up sebesar: Rp" + amount + " dan extra 10%: Rp" + extra);
        return balance;
    }
}

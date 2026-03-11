package Pertemuan5_PBO;

public class Opalo extends Emoney {
    private boolean inPeriod;

    public Opalo(String id, double balance, String edition, boolean inPeriod) {
        super(id, balance, edition);
        this.inPeriod = inPeriod;
    }

    @Override
    public double topUp (int amount) {
        double more;

        if (inPeriod) {
            more = amount * 0.2;
            System.out.println("Tambahan periode promosi: Rp" + more);
        } else {
            more = amount * 0.05;
            System.out.println("Tambahan non-periode promosi: Rp" + more);
        }

        balance += amount + more;
        System.out.println("Berhasil top up sebesar: Rp" + amount + " dengan tambahan Rp" + more);
        return balance;
    }

    @Override
    public double pay (int amount) {
        System.out.println("Diskon 10%");
        double discount = amount * 0.1;
        double finalAmount = amount - discount;

        balance -= finalAmount;
        System.out.println("Berhasil membayar sebesar: Rp" + finalAmount + " setelah diskon 10%");

        return balance;
    }
}

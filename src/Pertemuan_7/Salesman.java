package Pertemuan_7;

class Salesman extends Karyawan {
    private double penjualan;
    private double target;

    public Salesman (String nama, double gaji, double penjualan, double target) {
        super(nama, 'S', gaji);
        this.penjualan = penjualan;
        this.target = target;
    }

    @Override
    public double getTHR() {
        if (penjualan >= target) {
            return 2 * gaji;
        } else {
            return gaji;
        }
    }
}

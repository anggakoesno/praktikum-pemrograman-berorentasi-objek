package Pertemuan_9;

class Salesman extends Karyawan implements TargetPenjualan {
    private double penjualan;
    private double target;

    public Salesman (String nama, double gaji, String jenisKelamin, double target)
            throws DataTidakValidException {
        super(nama, 'S', gaji, jenisKelamin);
        this.target = target;
    }

    @Override
    public void setPenjualan (double jumlah) throws DataTidakValidException {
        if (jumlah < 0) {
            throw new DataTidakValidException("Penjualan tidak valid.");
        }

        this.penjualan = jumlah;
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

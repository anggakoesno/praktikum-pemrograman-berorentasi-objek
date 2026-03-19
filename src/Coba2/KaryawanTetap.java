package Coba2;

public class KaryawanTetap extends Karyawan {
    private double tunjangan;

    public KaryawanTetap (String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public String tampilkanData() {
        return "Nama: " + getNama() +
                "\nGaji Pokok: " + getGajiPokok() +
                "\nTunjangan: " + getTunjangan() +
                "\nTotal Gaji: " + (getGajiPokok() + getTunjangan()) +
                "\nStatus: " + StatusKaryawan.aktif;
    }
}

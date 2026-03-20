package Coba2;
import java.text.DecimalFormat;

public class KaryawanTetap extends Karyawan {
    private double tunjangan;

    public KaryawanTetap (String nama, double gajiPokok, double tunjangan, StatusKaryawan status) {
        super(nama, gajiPokok, status);
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    DecimalFormat df = new DecimalFormat("0.##");

    @Override
    public String tampilkanData() {
        return "Nama: " + getNama() +
                "\nGaji Pokok: " + getGajiPokok() +
                "\nTunjangan: " + getTunjangan() +
                "\nTotal Gaji: " + (df.format(getGajiPokok() + getTunjangan())) +
                "\nStatus: " + getStatus().getStatus();
    }
}

package Coba2;

public class Karyawan {
    private String nama;
    private double gajiPokok;

    public static int jumlahKaryawan;

    public Karyawan (String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;

        jumlahKaryawan++;
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public String tampilkanData() {
        return "Data Pegawai " + jumlahKaryawan + "Nama: " + nama + "\nGaji Pokok: " + gajiPokok;
    }
}

package Coba2;

public class Karyawan {
    private String nama;
    private double gajiPokok;
    private StatusKaryawan status;

    private static int jumlahKaryawan = 0;

    public Karyawan (String nama, double gajiPokok, StatusKaryawan status) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.status = status;

        jumlahKaryawan++;
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public StatusKaryawan getStatus() {
        return status;
    }

    public static int getJumlahKaryawan() {
        return jumlahKaryawan;
    }

    public String tampilkanData() {
        return "Nama: " + nama + "\nGaji Pokok: " + gajiPokok;
    }
}

package Coba2;

public class Karyawan {
    private String nama;
    private double gajiPokok;

    private static int jumlahKaryawan;

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

    public static int getJumlahKaryawan() {
        return jumlahKaryawan;
    }

    public String tampilkanData() {
        return "Nama: " + nama + "\nGaji Pokok: " + gajiPokok;
    }
}

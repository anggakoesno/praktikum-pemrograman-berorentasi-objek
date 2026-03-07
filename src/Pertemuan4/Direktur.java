package Pertemuan4;

public class Direktur extends Pegawai {
    double tunjanganDireksi;

    public Direktur(String nama, int umur, double gajiPokok, double tunjanganDireksi) {
        this.nama = nama;
        this.umur = umur;
        this.gajiPokok = gajiPokok;
        this.tunjanganDireksi = tunjanganDireksi;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\n" +
                "Umur: " + umur + "\n" +
                "Gaji Pokok: " + gajiPokok + "\n" +
                "Tunjangan Direksi: " + tunjanganDireksi + "\n";
    }
}

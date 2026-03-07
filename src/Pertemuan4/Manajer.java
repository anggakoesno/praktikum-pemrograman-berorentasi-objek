package Pertemuan4;

public class Manajer extends Pegawai {
    String departemen;
    double tunjanganJabatan;

    public Manajer(String nama, int umur, double gajiPokok, String departemen, double tunjanganJabatan) {
        this.nama = nama;
        this.umur = umur;
        this.departemen = departemen;
        this.gajiPokok = gajiPokok;
        this.tunjanganJabatan = tunjanganJabatan;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\n" +
                "Umur: " + umur + "\n" +
                "Departemen: " + departemen + "\n" +
                "Gaji Pokok: " + gajiPokok + "\n" +
                "Tunjangan Direksi: " + tunjanganJabatan + "\n";
    }
}

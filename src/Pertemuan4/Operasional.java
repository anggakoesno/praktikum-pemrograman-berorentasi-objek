package Pertemuan4;

public class Operasional extends Pegawai {
    double tunjanganLembur;

    public Operasional (String nama, int umur, double gajiPokok, double tunjanganLembur) {
        this.nama = nama;
        this.umur = umur;
        this.gajiPokok = gajiPokok;
        this.tunjanganLembur = tunjanganLembur;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\n" +
                "Umur: " + umur + "\n" +
                "Gaji Pokok: " + gajiPokok + "\n" +
                "Tunjangan Lembur: " + tunjanganLembur + "\n";
    }
}

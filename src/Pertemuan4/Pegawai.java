package Pertemuan4;

public class Pegawai {
    protected String nama;
    protected int umur;
    protected double gajiPokok;

    @Override
    public String toString() {
        return "Nama: " + nama + "\n" +
                "Umur: " + umur + "\n" +
                "Gaji Pokok: " + gajiPokok + "\n";
    }
}

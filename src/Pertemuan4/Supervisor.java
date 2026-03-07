package Pertemuan4;

public class Supervisor extends Pegawai {
    double tunjanganPengawasan;

    public Supervisor (String nama, int umur, double gajiPokok, double tunjanganPengawasan) {
        this.nama = nama;
        this.umur = umur;
        this.gajiPokok = gajiPokok;
        this.tunjanganPengawasan = tunjanganPengawasan;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\n" +
                "Umur: " + umur + "\n" +
                "Gaji Pokok: " + gajiPokok + "\n" +
                "Tunjangan Pengawasan: " + tunjanganPengawasan + "\n";
    }
}

package Pertemuan3;

public class Pegawai {
    String nama;
    int umur;
    double gaji;

    static int banyak = 0;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void tampilkanData(String nama, int umur, double gaji) {
        System.out.println("Data Pegawai ke-" + banyak);
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
        System.out.println("Gaji: " + this.gaji);
        System.out.println();
    }

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setNama("Angga");
        pegawai1.setUmur(18);
        pegawai1.setGaji(25000000);
        banyak += 1;
        pegawai1.tampilkanData(pegawai1.nama, pegawai1.umur, pegawai1.gaji);

        Pegawai pegawai2 = new Pegawai();
        pegawai2.setNama("Anggaaaaaa");
        pegawai2.setUmur(18);
        pegawai2.setGaji(25000000);
        banyak += 1;
        pegawai2.tampilkanData(pegawai2.nama, pegawai2.umur, pegawai2.gaji);
    }
}

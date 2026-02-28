package Pertemuan3;

public class Pegawai {
    private String nama;
    private int umur;
    private double gaji;
    private static int jumlahPegawai = 0;

    public Pegawai (String nama, int umur, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
        jumlahPegawai++;
    }

    // Method untuk menghasilkan output sesuai format yang diminta
    public String info() {
        return "Pegawai " + nama + " berumur " + umur + " memiliki gaji sebesar " + gaji;
    }

    public static int getJumlahPegawai() {
        return jumlahPegawai;
    }

    // Contoh penggunaan
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai("Andi", 25, 5000000);
        Pegawai p2 = new Pegawai("Siti", 30, 7500000);

        System.out.println(p1.info());
        System.out.println(p2.info());

        System.out.println("Jumlah objek pegawai yang dibuat: " + Pegawai.getJumlahPegawai());
    }
}

//public class Pegawai {
//    String nama;
//    int umur;
//    double gaji;
//
//    static int banyak = 0;
//
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//
//    public void setUmur(int umur) {
//        this.umur = umur;
//    }
//
//    public void setGaji(double gaji) {
//        this.gaji = gaji;
//    }
//
//    public void tampilkanData(String nama, int umur, double gaji) {
//        System.out.println("Data Pegawai ke-" + banyak);
//        System.out.println("Nama: " + this.nama);
//        System.out.println("Umur: " + this.umur);
//        System.out.println("Gaji: " + this.gaji);
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Pegawai pegawai1 = new Pegawai();
//        pegawai1.setNama("Angga");
//        pegawai1.setUmur(18);
//        pegawai1.setGaji(25000000);
//        banyak += 1;
//        pegawai1.tampilkanData(pegawai1.nama, pegawai1.umur, pegawai1.gaji);
//
//        Pegawai pegawai2 = new Pegawai();
//        pegawai2.setNama("Anggaaaaaa");
//        pegawai2.setUmur(18);
//        pegawai2.setGaji(25000000);
//        banyak += 1;
//        pegawai2.tampilkanData(pegawai2.nama, pegawai2.umur, pegawai2.gaji);
//    }
//}

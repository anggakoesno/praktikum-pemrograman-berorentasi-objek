package Latihan_PraUTS;

public class BukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Anak Semua Bangsa", "Pramoedya Ananta Toer", 12);
        Buku buku2 = new Buku("Edensor", "Andrea Hirata", 7);

        System.out.println("=== STATUS AWAL PERPUSTAKAAN ===");
        buku1.infoBuku();
        buku2.infoBuku();

        System.out.println("=== AKTIVITAS PEMINJAMAN ===");
        buku1.pinjamBuku(14);
        buku1.pinjamBuku(2);
        buku2.pinjamBuku(4);

        System.out.println("=== AKTIVITAS PENGEMBALIAN ===");
        buku1.kembalikanBuku(2);
        buku2.kembalikanBuku(3);

        System.out.println("=== STATUS AKHIR PERPUSTAKAAN ===");
        System.out.println("Laporan Akhir untuk: " + buku1.getJudul());
        buku1.infoBuku();

        System.out.println("Laporan Akhir untuk: " + buku2.getJudul());
        buku2.infoBuku();
    }
}

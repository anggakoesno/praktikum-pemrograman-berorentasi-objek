package Latihan_PraUTS;

public class Buku {
    private String judul;
    private String penulis;
    private String isbn;
    private int stok;
    private static int kode = 1;

    public Buku(String judul, String penulis, int stokAwal) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = buatIsbn();
        this.stok = stokAwal;
    }

    private String buatIsbn() {
        return "ISBN-" + String.format("%03d", kode++);
    }

    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }
    public String getPenulis() { return penulis; }
    public void setPenulis(String penulis) { this.penulis = penulis; }
    public String getIsbn() { return isbn; }
    public int getStok() { return stok; }
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Peringatan: Stok tidak boleh negatif!");
        }
    }

    public void infoBuku() {
        System.out.println("Judul   : " + judul);
        System.out.println("ISBN    : " + isbn);
        System.out.println("Penulis : " + penulis);
        System.out.println("Stok    : " + stok + "\n");
    }

    public void pinjamBuku(int jumlah) {
        if (stok >= jumlah) {
            setStok(stok - jumlah);
            System.out.println("Berhasil meminjam " + jumlah + " buku: " + judul);
        } else {
            System.out.println("Gagal! Stok '" + judul + "' tidak mencukupi.");
        }
        System.out.println("---");
    }

    public void kembalikanBuku(int jumlah) {
        setStok(stok + jumlah);
        System.out.println("Berhasil mengembalikan " + jumlah + " buku: " + judul);
        System.out.println("---");
    }
}

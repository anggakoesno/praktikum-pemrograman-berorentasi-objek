package Coba;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Jumlah produk elektronik: ");
        int jumlahProduk = inputan.nextInt();

        ProdukElektronik[] daftarProduk = new ProdukElektronik[jumlahProduk];

        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println("Isi data produk elektronik ke-" + (i+1));
            System.out.print("Nama: ");
            String n = inputan.next();
            System.out.print("Harga: ");
            double h = inputan.nextDouble();
            System.out.print("Masa Garansi (bulan): ");
            int g = inputan.nextInt();

            daftarProduk[i] = new ProdukElektronik(n, h, g);
        }

        System.out.println("=== Daftar Produk Elektronik ===");
        for (int j = 0; j < daftarProduk.length; j++) {
            System.out.println("Data Produk ke-" + (j+1));
            System.out.println("Nama: " + daftarProduk[j].getNama());
            System.out.println("Harga: " + daftarProduk[j].getHarga());
            System.out.println("Garansi: " + daftarProduk[j].getGaransi());
            System.out.println("-------------------------");
        }
    }
}

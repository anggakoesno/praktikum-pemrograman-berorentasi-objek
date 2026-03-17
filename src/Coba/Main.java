package Coba;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Jumlah produk elektronik: ");
        int jumlahProduk = inputan.nextInt();

        String [] nama = new String[jumlahProduk];
        double [] harga = new double[jumlahProduk];

        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println("Isi data produk elektronik ke-" + (i+1));
            System.out.print("Nama: ");
            String n = inputan.next();
            System.out.print("Harga: ");
            double h = inputan.nextInt();

            nama[i] = n;
            harga[i] = h;
        }

        System.out.println("Daftar produk elektronik: ");
        for (int j = 0; j < jumlahProduk; j++) {
            System.out.println("Nama Produk: " + (nama[j]));
            System.out.println("Harga Produk: " + (harga[j]));
        }

    }
}

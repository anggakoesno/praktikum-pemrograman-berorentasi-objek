package Pertemuan2;
import java.util.Arrays;
import java.util.Scanner;

public class Tugas {

    public static void main (String[] args) {
        // --- Nomor 1 ---
        // Inisialisasi Scanner untuk menerima inputan
        Scanner input = new Scanner(System.in);

        // Menerima inputan size array
        System.out.print("Masukkan size array: ");
        int size = input.nextInt();

        // Siapkan array wadah untuk menampung inputan daftar angka
        int [] wadah = new int[size];

        // Menerima inputan daftar angka
        System.out.println("Masukkan angka array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Angka " + (i+1) + ": ");
            int angka = input.nextInt(); // variabel angka akan menerima inputan angka

            wadah[i] = angka; // memasukkan variabel angka ke dalam wadah sesuai index
        }

        // Menampilkan hasil array
        System.out.print("Final array: ");
        System.out.println(Arrays.toString(wadah));

        // Menghitung jumlah seluruh angka dalam array untuk dipakai menghitung rata-rata
        int jumlah = 0;
        for (int nilai : wadah) {
            jumlah += nilai;
        }

        // Menghitung rata-rata
        double avg = (double) jumlah/wadah.length;
        System.out.println("Rata-rata: " + avg);

        // Siapkan string moreAVG untuk menampung angka yang melebihi rata-rata
        String moreAVG = "";

        // Memasukkan angka di dalam array yang lebih besar dari rata-rata
        for (int idx = 0; idx < wadah.length; idx++) { // cek semua angka di dalam array
            if (wadah[idx] > avg) { // jika angka tersebut > rata-rata
                moreAVG += wadah[idx] + " "; // masukkan ke dalam variabel moreAVG
            }
        }

        if (moreAVG.isEmpty()) { // jika variabel moreAVG kosong
            moreAVG = "Tidak ada angka yang lebih besar dari rata-rata.";
        }

        // Menampilkan angka yang lebih besar dari rata-rata
        System.out.print("Angka yang lebih besar dari rata-rata: " + moreAVG);

        // --- Nomor 2 ---
//        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran matriks: ");
        int ukuran = input.nextInt();

        int [][] matriks = new int[ukuran][ukuran];

        for (int i = 0; i < ukuran; i++) {
            boolean sah = false;
            while (!sah) {
                System.out.print("Masukkan angka untuk baris ke-" + (i + 1) + " (dipisahkan spasi): ");
                String inputBaris = input.nextLine();
                String[] angka = inputBaris.split(" ");

                if (angka.length != ukuran) {
                    System.out.println("Jumlah kolom tidak sesuai, silakan masukkan " + ukuran + " buah angka!");
                } else {
                    for (int j = 0; j < ukuran; j++) {
                        matriks[i][j] = Integer.parseInt(angka[j]);
                    }
                    sah = true;
                }
            }
        }

        int nilaiMaks = matriks[0][0];
        int nilaiMin = matriks[0][0];
        int diagonalUtama = 0;

        System.out.println("\nHasil matriks: ");
        for (int b = 0; b < ukuran; b++) {
            for (int k = 0; k < ukuran; k++) {
                int nilai = matriks[b][k];
                System.out.print(nilai + " ");


                if (nilai > nilaiMaks) {
                    nilaiMaks = nilai;
                }

                if (nilai < nilaiMin) {
                    nilaiMin = nilai;
                }

                if (b == k) {
                    diagonalUtama += nilai;
                }
            }
            System.out.println();
        }

        System.out.println("Nilai maksimal adalah : " + nilaiMaks);
        System.out.println("Nilai minimum adalah : " + nilaiMin);
        System.out.println("Jumlah diagonal utama adalah : " + diagonalUtama);
        }
    }
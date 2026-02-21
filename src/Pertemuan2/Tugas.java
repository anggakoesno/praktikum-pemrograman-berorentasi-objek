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
        // Inisialisasi Scanner
//        Scanner input = new Scanner(System.in);

        // Menerima input ukuran matriks
        System.out.print("Masukkan ukuran matriks: ");
        int ukuran = input.nextInt();

        // Menyiapkan array untuk menampung matriks
        int [][] matriks = new int[ukuran][ukuran];


        for (int i = 0; i < ukuran; i++) { // Perulangan untuk baris
            boolean sah = false; // Anggapan apabila input pengguna salah
            while (!sah) { // Selama input belum sah
                System.out.print("Masukkan angka untuk baris ke-" + (i + 1) + " (dipisahkan spasi): ");
                String inputBaris = input.nextLine(); // Menerima input daftar angka dalam bentuk string
                String[] angka = inputBaris.split(" "); // Memotong string yang dipisahkan spasi

                if (angka.length != ukuran) { // Jika banyak angka yang diinput tidak sesuai dengan ukuran yang ditentukan
                    System.out.println("Jumlah kolom tidak sesuai, silakan masukkan " + ukuran + " buah angka!");
                } else { // Jika banyak angka yang diinput sesuai dengan ukuran yang ditentukan
                    for (int j = 0; j < ukuran; j++) { // Perulangan untuk kolom
                        // Masukkan angka-angka untuk 1 baris (dengan beberapa kolom)
                        matriks[i][j] = Integer.parseInt(angka[j]); // parseInt = mengubah string angka menjadi integer
                    }
                    sah = true; // Inputan sah, keluar dari while, masuk ke for, i bertambah
                }
            }
        }

        // Deklarasi dan inisialisasi variabel untuk menampung nilai terbesar, nilai terkecil, dan jumlah diagonal utama
        int nilaiMaks = matriks[0][0]; // nilai matriks di baris sekian dan kolom sekian
        int nilaiMin = matriks[0][0];
        int diagonalUtama = 0;

        System.out.println("\nHasil matriks: ");
        for (int b = 0; b < ukuran; b++) { // Perulangan baris
            for (int k = 0; k < ukuran; k++) { // Perulangan kolom
                int nilai = matriks[b][k];
                System.out.print(nilai + " ");


                if (nilai > nilaiMaks) { // Jika nilai di matriks[b][k] > matriks[0][0]
                    nilaiMaks = nilai; // Perbarui nilaiMaks => matriks[0][0] = matriks[b][k]
                }

                if (nilai < nilaiMin) { // Jika nilai di matriks[b][k] < matriks[0][0]
                    nilaiMin = nilai; // Perbarui nilaiMin => matriks[0][0] = matriks[b][k]
                }

                if (b == k) { // Jika nilai matriks berada di posisi NN == diagonal utama
                    diagonalUtama += nilai; // Perbarui jumlah diagonal utama => diagonalUtama = diagonalUtama + matriks[b][k]
                }
            }
            System.out.println(); // Membuat baris baru setelah perulangan kolom terselesaikan
        }

        // Menampilkan hasil
        System.out.println("Nilai maksimal adalah : " + nilaiMaks);
        System.out.println("Nilai minimum adalah : " + nilaiMin);
        System.out.println("Jumlah diagonal utama adalah : " + diagonalUtama);
        }
    }
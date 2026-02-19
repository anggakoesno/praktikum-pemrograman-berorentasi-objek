package Pertemuan2;

import java.util.Arrays;

public class Perulangan {

    public static void main (String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println("=======================");
//
//        for (int i = 5; i > 0; i--) {
//            System.out.println(i);
//        }
//
//        System.out.println("=======================");
//
//        int [] ar = {10, 50, 60, 80, 90};
//
//        for (int element : ar)
//            System.out.print(element + " ");
//
//        System.out.println("\n=======================");
//
//        int j = 0;
//        while (j < 5) {
//            System.out.println(j);
//            j++;
//        }
//
//        System.out.println("=======================");
//
//        int k = 0;
//        do {
//            System.out.println(k);
//            k++;
//        } while (k < 5);

        // --- Latihan 1: Print Bilangan 1 - 5 ---
//        // For
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println("======");
//
//        // While do
//        int j = 1;
//        while (j <= 5) {
//            System.out.println(j);
//            j++;
//        }
//
//        System.out.println("======");
//
//        // Do while
//        int k = 1;
//        do {
//            System.out.println(k);
//            k++;
//        } while (k <= 5);

        // --- Latihan 2: Faktorial ---
//        Coba 1
//        int hasil = 1;
//        for (int i = 1; i <= 5; i++) {
//            hasil *= i;
//        }
//        System.out.println(hasil);

//        Coba 2
//        int f = 5;
//        int hasil = 1;
//        while (f > 0) {
//            hasil = hasil * f;
//            f--;
//        }

        // Latihan 3: String "bakSoo" dengan perulangan
        // Coba 1
//        char [] bakso = {'b', 'a', 'k', 'S', 'o', 'o'};
//
//        for (char gabungan : bakso)
//            System.out.print(gabungan);

        // Coba 2
//        String bakso = "bakSoo";
//        char [] huruf = new char [bakso.length()];
//        String gabung = "";
//
//        for (int i = 0; i < bakso.length(); i++) {
//            char masuk = bakso.charAt(i);
//
//            huruf[i] = masuk;
//
//            gabung += masuk;
//        }
//
//        System.out.println("Isi array: " + Arrays.toString(huruf));
//        System.out.println("Gabungan: " + gabung);

        // Coba 3
//        char [] ar = {'b', 'a', 'k', 'S', 'o', 'o'};
//
//        for (char gabung : ar)
//            System.out.print(gabung + " ");

        // --- Latihan 4: Print Akar Kuadrat ---
//        for (double i = 1; i <= 20; i++) {
//            double hasilAkar = Math.sqrt(i);
//            double error = i - hasilAkar * hasilAkar;
//
//            System.out.println("Akar dari " + i + " adalah " + hasilAkar);
//            System.out.println("Error adalah " + error + "\n");
//        }

        // --- Latihan 5: Array 2D Tabel ---
        int baris = 3;
        int kolom = 4;
        int j = 1;

        for (int b = 1; b <= baris ; b++) {
            for (int k = 1; k <= kolom; k++) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }

    }
}

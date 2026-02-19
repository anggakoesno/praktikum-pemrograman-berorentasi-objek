package Pertemuan2;
import java.util.Arrays;
import java.util.Scanner;

public class Tugas {

    public static void main (String[] args) {
        // --- Nomor 1 ---
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan size array: ");
        int size = input.nextInt();

        int [] wadah = new int[size];

        System.out.println("Masukkan angka array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Angka " + (i+1) + ": ");
            int angka = input.nextInt();

            wadah[i] = angka;
        }

        System.out.print("Final array: ");
        System.out.println(Arrays.toString(wadah));

        int jumlah = 0;
        for (int nilai : wadah) {
            jumlah += nilai;
        }

        double avg = (double) jumlah/wadah.length;

        System.out.println("Rata-rata: " + avg);

        String moreAVG = "";

        for (int idx = 0; idx < wadah.length; idx++) {
            if (wadah[idx] > avg) {
                moreAVG += wadah[idx] + " ";
            }
        }

        if (moreAVG.isEmpty()) {
            moreAVG = "Tidak ada angka yang lebih besar dari rata-rata.";
        }

        System.out.print("Angka yang lebih besar dari rata-rata: " + moreAVG);
    }
}
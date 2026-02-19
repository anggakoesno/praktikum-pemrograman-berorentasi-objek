package Pertemuan2;

import java.util.Arrays; // util untuk fungsi .toString

public class Array {

    public static void main (String[] args) {
        // Deklarasi dan Inisiasi Array
        // Tanpa ukuran
        int [] array1;
        array1 = new int [3];
        array1[0] = 5;
        array1[1] = 3;
        array1[2] = 7;

        int jumlah = array1[0] + array1[1] + array1[2];
        System.out.println("Jumlah integer di dalam array1: " + jumlah);

        // Dengan ukuran
        char [] array2 = new char[6];
        array2[0] = 'b';
        array2[1] = 'a';
        array2[2] = 'k';
        array2[3] = 's';
        array2[4] = 'o';
        array2[5] = 'o';

        String teks = "" + array2[0] + array2[1] + array2[2] + array2[3] + array2[4] + array2[5];
        System.out.println("Gabungan char di array2: " + teks);


        // Otomatis isi elemen
        int [] array3 = {10, 20, 30, 40, 50};
        int [] array4 = new int [] {11, 22, 33, 44, 55};

        System.out.println(array3[0]);
        System.out.println(array4[2]);

        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));


        // Array 2 dimensi
        // ukuran 2 x 3 dengan elemen increment dari 1
        int baris = 2;
        int kolom = 3;
        int[][] tabel = new int [baris][kolom];

        tabel[0][0] = 1;
        tabel[0][1] = 2;
        tabel[0][2] = 3;

        tabel[1][0] = 4;
        tabel[1][1] = 5;
        tabel[1][2] = 6;

        String teksTabel1 = "" + tabel[0][0] + tabel[0][1] + tabel[0][2];
        String teksTabel2 = "" + tabel[1][0] + tabel[1][1] + tabel[1][2];

        System.out.println(teksTabel1);
        System.out.println(teksTabel2);
    }
}

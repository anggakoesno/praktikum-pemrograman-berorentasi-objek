package Pertemuan1;

import java.util.Scanner;

public class LatihanDeklarasiInput {
    public static void main(String[] args) {
        // ------ Latihan 1: Nomor 1 ------
        int panjang;
        int lebar;
        int tinggi;
        int volume;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Panjang balok: ");
        panjang = scanner.nextInt();
        System.out.print("Lebar balok: ");
        lebar = scanner.nextInt();
        System.out.print("Tinggi balok: ");
        tinggi = scanner.nextInt();

        volume = panjang * lebar * tinggi;
        System.out.println("Volume balok: " + volume);

        // ------ Latihan 1: Nomor 2 ------
        double alas2;
        double tinggi2;
        double luas;

        // Scanner scanner = new Scanner(System.in);
        System.out.print("Alas segitiga: ");
        alas2 = scanner.nextInt();
        System.out.print("Tinggi segitiga: ");
        tinggi2 = scanner.nextInt();

        luas = (alas2 * tinggi2) / 2;
        System.out.println("Luas segitiga: " + luas);

        // ------ Latihan 2: Nomor 1 ------
        double volumeGalon;
        int jumlahGalon;
        double volumeTotal;

        volumeGalon = 3.7854;
        System.out.println("Volume galon adalah " + volumeGalon + " liter.");

        // Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah galon: ");
        jumlahGalon = scanner.nextInt();

        volumeTotal = volumeGalon * jumlahGalon;
        System.out.println("Volume dari " + jumlahGalon + " buah galon adalah " + volumeTotal + " liter.");

    }
}

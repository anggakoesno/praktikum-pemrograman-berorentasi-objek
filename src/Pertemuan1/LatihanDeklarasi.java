package Pertemuan1;

public class LatihanDeklarasi {
    public static void main(String[] args) {
        //  ------ Latihan 1: Nomor 1 ------
        int panjang;
        int lebar;
        int tinggi;
        int volume;

        panjang = 58;
        lebar = 88;
        tinggi = 7;
        volume = panjang * lebar * tinggi;

        System.out.println("Volume dari balok adalah: " + volume);

        // ------ Latihan 1: Nomor 2 ------
        int alas2;
        int tinggi2;
        double luas2;

        alas2 = 98;
        tinggi2 = 57;
        luas2 = (alas2 * tinggi2) / 2;

        System.out.println("Luas segitiga adalah: " + luas2);

        // ------ Latihan 2: Nomor 1 ------
        double volumeGalon;
        int jumlahGalon;
        double volumeTotal;

        volumeGalon = 3.7854;
        jumlahGalon = 10;
        volumeTotal = volumeGalon * jumlahGalon;

        System.out.println("Volume dari " + jumlahGalon + " adalah: " + volumeTotal + " liter");
    }
}

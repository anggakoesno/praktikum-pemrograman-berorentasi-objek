package Pertemuan5;

import java.util.Scanner;

public class Main {
    public static Kendaraan[] parkir;
    public static int kendaraanKeluar = 0;
    public static int totalPendapatan = 0;

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal slot parkir: ");
        int jumlahSlot = inputan.nextInt();

        parkir = new Kendaraan[jumlahSlot];

        int menu;

        do {
            System.out.println("\n=== MENU PARKIR ===");
            System.out.println("1. Lihat Status Parkir");
            System.out.println("2. Tambah Kendaraan");
            System.out.println("3. Pindah Kendaraan");
            System.out.println("4. Keluar Kendaraan");
            System.out.println("5. Exit");

            menu = inputan.nextInt();

            switch (menu) {
                case 1:
                    lihatStatus();
                    break;
                case 2:
                    tambahKendaraan(inputan);
                    break;
                case 3:
                    pindahKendaraan(inputan);
                    break;
                case 4:
                    keluarKendaraan(inputan);
                    break;
                case 5:
                    laporan();
                    break;
                default:
                    System.out.println("Menu yang dipilih tidak tersedia");
            }
        } while (menu != 5);
    }

    public static void lihatStatus() {
        System.out.println("\n=== STATUS PARKIR ===");

        for (int i = 0; i < parkir.length; i++) {
            if (parkir[i] != null) {
                System.out.println(
                        "Slot " + i +
                                " | Plat: " + parkir[i].getPlatNomor() +
                                " | Jenis: " + parkir[i].getJenis() +
                                " | Waktu Masuk: " + parkir[i].getWaktuMasuk());
            } else {
                System.out.println("Slot " + i + " kosong");
            }
        }
    }

    public static void tambahKendaraan(Scanner inputan) {
        System.out.print("Plat Nomor: ");
        String plat = inputan.next();

        System.out.print("Jenis (Mobil/Motor): ");
        String jenis = inputan.next();

        System.out.print("Waktu Masuk (jam): ");
        int waktu = inputan.nextInt();

        for (int i = 0; i < parkir.length; i++) {
            if (parkir[i] == null) {

                if (jenis.equalsIgnoreCase("Mobil")) {
                    parkir[i] = new Mobil(plat, waktu, i);
                } else {
                    parkir[i] = new Motor(plat, waktu, i);
                }

                System.out.println("Kendaraan masuk di slot " + i);
                return;
            }
        }

        System.out.println("Parkir penuh!");
    }

    public static void pindahKendaraan(Scanner inputan) {
        System.out.print("Slot asal: ");
        int asal = inputan.nextInt();

        System.out.print("Slot tujuan: ");
        int tujuan = inputan.nextInt();

        if (parkir[asal] == null) {
            System.out.println("Slot asal kosong!");
            return;
        }

        if (parkir[tujuan] != null) {
            System.out.println("Slot tujuan sudah terisi!");
            return;
        }

        parkir[tujuan] = parkir[asal];
        parkir[tujuan].setSlot(tujuan);
        parkir[asal] = null;

        System.out.println("Kendaraan berhasil dipindah.");
    }

    public static void keluarKendaraan(Scanner inputan) {
        System.out.print("Masukkan plat nomor: ");
        String plat = inputan.next();

        for (int i = 0; i < parkir.length; i++) {

            if (parkir[i] != null && parkir[i].getPlatNomor().equalsIgnoreCase(plat)) {

                System.out.print("Waktu keluar: ");
                int keluar = inputan.nextInt();

                int lama = keluar - parkir[i].getWaktuMasuk();

                int biaya = parkir[i].hitungBiayaParkir(lama);

                totalPendapatan += biaya;
                kendaraanKeluar++;

                parkir[i] = null;

                System.out.println("Kendaraan berhasil keluar.");
                System.out.println("Total biaya: Rp" + biaya);
                return;
            }
        }

        System.out.println("Kendaraan tidak ditemukan.");
    }

    public static void laporan() {
        System.out.println("\n=== LAPORAN PARKIR ===");

        if (kendaraanKeluar == 0) {
            System.out.println("Parkiran sepi hari ini, semoga besok lebih ramai");
        } else {
            System.out.println("Jumlah kendaraan keluar: " + kendaraanKeluar);
            System.out.println("Total pendapatan: Rp" + totalPendapatan);
        }
    }

}

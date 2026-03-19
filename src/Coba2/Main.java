package Coba2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Jumlah karyawan: ");
        int jumlahKaryawan = inputan.nextInt();

        KaryawanTetap[] daftarKaryawanTetap = new KaryawanTetap[jumlahKaryawan];

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("Isi data karyawan ke-" + (i+1));
            System.out.print("Nama: ");
            String n = inputan.next();
            System.out.print("Gaji Pokok: ");
            double gP = inputan.nextDouble();
            System.out.print("Tunjangan: ");
            double t = inputan.nextDouble();

            daftarKaryawanTetap[i] = new KaryawanTetap(n, gP, t);
        }

        System.out.println("=== Daftar Karyawan ===");
        for (int j = 0; j < daftarKaryawanTetap.length; j++) {
            System.out.println("Data karyawan ke-" + (j+1));
            System.out.println(daftarKaryawanTetap[j].tampilkanData());
        }
    }
}

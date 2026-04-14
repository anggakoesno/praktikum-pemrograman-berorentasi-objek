package Pertemuan_7;

public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan[] karyawans = {
                new KaryawanBiasa("Andi", 5000000),
                new Manager("Bayu", 7000000, "Pusat"),
                new Manager("Cahyo", 7000000, "Cabang"),
                new Salesman("Dono", 4000000, 150, 100),
                new Salesman("Eko", 4000000, 110, 130)
        };

        for (Karyawan k : karyawans) {
            k.showInfo();
            System.out.println();
        }

    }
}

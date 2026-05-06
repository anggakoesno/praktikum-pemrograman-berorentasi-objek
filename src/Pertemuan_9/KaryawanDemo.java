package Pertemuan_9;

public class KaryawanDemo {
    public static void main(String[] args) {
        try {
            Karyawan k = new KaryawanBiasa ("Aji", 5000000, "Pria");
            k.tambahCuti(-1);
            k.tambahCuti("Pernikahan");
            System.out.println("Pembuatan objek berhasil!");
        }  catch (DataTidakValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Manager m = new Manager("Bayu", 7000000, "Pusat", "Pria");
            m.tambahCuti("Persalinan");
            System.out.println("Pembuatan objek berhasil!");
        } catch (DataTidakValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Manager m1 = new Manager("Tejo", -1000, "Pria", "Pria");
            System.out.println("Pembuatan objek berhasil!");
        } catch (DataTidakValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Salesman s = new Salesman("Intan", 400000, "Wanita", 100);
            s.setPenjualan(130);
            s.tambahCuti(2);
            System.out.println("Pembuatan objek berhasil!");
        } catch (DataTidakValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Salesman s1 = new Salesman("Intan", 4000000, "Wanita", 100);
            s1.setPenjualan(-1);
            System.out.println("Pembuatan objek berhasil!");
        } catch (DataTidakValidException e) {
            System.out.println(e.getMessage());
        }

    }
}

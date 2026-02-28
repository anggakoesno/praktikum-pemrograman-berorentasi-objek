package Pertemuan3;

public class Score {
    private double [] daftarNilai = new double[10];
    private int banyakNilai = 0;

    public void tambahNilai(double nilai) {
        if (banyakNilai < daftarNilai.length) {
            daftarNilai[banyakNilai] = nilai;
            banyakNilai++;
            System.out.println("Nilai " + nilai + " berhasil ditambahkan");
        } else {
            System.out.println("Maaf, data nilai sudah penuh.");
        }
    }

    public double getTotalNilai() {
        double totalNilai = 0;
        for (int i = 0; i < banyakNilai; i++) {
            totalNilai += daftarNilai[i];
        }
        return totalNilai;
    }

    public double getRataRata() {
        if (banyakNilai == 0) {
            return 0;
        }
        return getTotalNilai() / banyakNilai;
    }

    public double getNilaiMax() {
        if (banyakNilai == 0) {
            return 0;
        }
        double nilaiMax = daftarNilai[0];
        for (int i = 1; i < banyakNilai; i++) {
            if (daftarNilai[i] > nilaiMax) {
                nilaiMax = daftarNilai[i];
            }
        }
        return nilaiMax;
    }

    public double getNilaiMin() {
        if (banyakNilai == 0) {
            return 0;
        }
        double nilaiMin = daftarNilai[0];
        for (int i = 1; i < banyakNilai; i++) {
            if (daftarNilai[i] < nilaiMin) {
                nilaiMin = daftarNilai[i];
            }
        }
        return nilaiMin;
    }

    public double getSelisihNilai() {
        return getNilaiMax() - getNilaiMin();
    }

    public static void main(String[] args) {
        Score manager = new Score();

        manager.tambahNilai(92);
        manager.tambahNilai(87);
        manager.tambahNilai(85);

        System.out.println("Terdapat " + manager.banyakNilai + " data nilai dengan:");
        System.out.println("Total: " + manager.getTotalNilai());
        System.out.println("Rata-rata: " + manager.getRataRata());
        System.out.println("Tertinggi: " + manager.getNilaiMax());
        System.out.println("Terendah: " + manager.getNilaiMin());
        System.out.println("Selisih tertinggi dan terendah: " + manager.getSelisihNilai());
    }

}


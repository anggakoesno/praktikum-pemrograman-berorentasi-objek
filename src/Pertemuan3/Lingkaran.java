package Pertemuan3;

public class Lingkaran {
    int jari2;

    Lingkaran(int jari2) {
        this.jari2 = jari2;
    }

    double getLuas() {
        return Math.PI * jari2 * jari2;
    }

    double getKeliling() {
        return Math.PI * 2 * jari2;
    }

    @Override
    public String toString() {
        return "Lingkaran berjari2: " + this.jari2 + "\n" +
                "Luasnya: " + this.getLuas() + "\n" +
                "Kelilingnya: " + this.getKeliling();
    }
}

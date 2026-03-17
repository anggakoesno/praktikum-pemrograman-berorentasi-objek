package Pertemuan5;

public class Mobil extends Kendaraan {

    public Mobil(String platNomor, int waktuMasuk, int slot) {
        super(platNomor, "Mobil", waktuMasuk, slot);
    }

    @Override
    public int hitungBiayaParkir(int durasiJam) {
        return durasiJam * 5000;
    }
}
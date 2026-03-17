package Pertemuan5;

public class Motor extends Kendaraan {

    public Motor(String platNomor, int waktuMasuk, int slot) {
        super(platNomor, "Motor", waktuMasuk, slot);
    }

    @Override
    public int hitungBiayaParkir(int durasiJam) {
        return durasiJam * 2000;
    }
}

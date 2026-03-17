package Pertemuan5;

public class Kendaraan {
    private String platNomor;
    private String jenis;
    private int waktuMasuk;
    private int slot;

    public Kendaraan(String platNomor, String jenis, int waktuMasuk, int slot) {
        this.platNomor = platNomor;
        this.jenis = jenis;
        this.waktuMasuk = waktuMasuk;
        this.slot = slot;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getJenis() {
        return jenis;
    }

    public int getWaktuMasuk() {
        return waktuMasuk;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int tujuan) {
        this.slot = slot;
    }

    public int hitungBiayaParkir(int durasiJam) {
        return 0;
    }
}


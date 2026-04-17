package Latihan_PraUTS;

public class Bus extends Transportasi {
    public Bus (int nK, String jenis) {
        super(nK, jenis);
    }

    @Override
    public double hitungBiaya() {
        return 3500;
    }
}

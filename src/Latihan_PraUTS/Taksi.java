package Latihan_PraUTS;

public class Taksi extends Transportasi implements LayananEkstra {
    private double jarakTempuh;
    public Taksi (int nK, String jenis, double jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
        super(nK, jenis);
    }

    @Override
    public double biayaTambahan() {
        return 2000;
    }

    @Override
    public double hitungBiaya() {
        return (jarakTempuh * 5000) + biayaTambahan();
    }
}

package Latihan_PraUTS;

public class DosenTetap extends Pengajar {
    private double gajiPokok;
    private double tunjanganFungsional;

    public DosenTetap(String nama, double gajiPokok, double tunjanganFungsional) {
        super(nama);
        this.gajiPokok = gajiPokok;
        this.tunjanganFungsional = tunjanganFungsional;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganFungsional;
    }
}
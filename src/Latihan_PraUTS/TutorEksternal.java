package Latihan_PraUTS;

public class TutorEksternal extends Pengajar {
    private double jamMengajar;
    private double tarifPerJam;

    public TutorEksternal (String nama, double jamMengajar, double tarifPerJam) {
        super(nama);
        this.jamMengajar = jamMengajar;
        this.tarifPerJam = tarifPerJam;
    }

    @Override
    public double hitungGaji() {
        return jamMengajar * tarifPerJam;
    }
}

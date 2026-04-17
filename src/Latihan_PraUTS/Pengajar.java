package Latihan_PraUTS;

public class Pengajar {
    protected String id;
    protected String nama;
    private static int kode = 1;

    public Pengajar (String nama) {
        this.nama = nama;
        this.id = buatID();
    }

    private String buatID() {
        return "P-" + kode++;
    }

    public void infoPengajar() {
        System.out.println("ID: " + id +
                "\nNama: " + nama +
                "\nTipe: " + getClass().getSimpleName() +
                "\nGaji: " + hitungGaji() + "\n");
    }

    public double hitungGaji() {
        return 0;
    }

    public static void main(String[] args) {
        Pengajar p1 = new DosenTetap("Andi", 2000000, 150000);
        Pengajar p2 = new TutorEksternal("Bayu", 3, 150000);

        p1.infoPengajar();
        p2.infoPengajar();
    }
}
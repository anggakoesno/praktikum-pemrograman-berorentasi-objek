package Latihan_PraUTS;

abstract class Transportasi {
    protected String id;
    protected int nomorKendaraan;
    private static int jumlahKendaraan = 0;
    private static int otomatisTX = 0;
    private static int otomatisBS = 0;

    public Transportasi (int nK, String jenis) {
        this.nomorKendaraan = nK;
        this.id = buatID(jenis);
        jumlahKendaraan++;
    }

    private String buatID(String jenis) {
        String kode = "";
        int nomorUrut = 0;

        if (jenis.equalsIgnoreCase("Taksi")) {
            nomorUrut = ++otomatisTX;
            kode = "TX";
        } else if (jenis.equalsIgnoreCase("Bus")) {
            nomorUrut = ++otomatisBS;
            kode = "BS";
        } else {
            System.out.println("Jenis tidak valid.");
        }

        return kode + "-" + String.format("%03d", nomorUrut);
    }

    public int getJumlahKendaraan() {
        return jumlahKendaraan;
    }

    public abstract double hitungBiaya();

    public void tampilkanInfo() {
        System.out.println("Jumlah Kendaraan saat ini: " + getJumlahKendaraan());
        System.out.println("ID: " + id +
                "\nNomor: " + nomorKendaraan +
                "\nBiaya: " + hitungBiaya() + "\n");
    }
}

interface LayananEkstra { double biayaTambahan(); }


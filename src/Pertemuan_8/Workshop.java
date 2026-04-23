package Pertemuan_8;

public abstract class Workshop {
    protected String judul;
    protected String tglPelaksanaan;
    protected int kapasitasPeserta;
    protected String namaPemateri;
    protected String jenis;

    public Workshop (String judul, String tglPelaksanaan, int kapasitasPeserta,
                     String namaPemateri,String jenis) {
        this.judul = judul;
        this.tglPelaksanaan = tglPelaksanaan;
        this.kapasitasPeserta = kapasitasPeserta;
        this.namaPemateri = namaPemateri;
        this.jenis = jenis;
    }

    public String getJudul() { return judul; }
    public String getTglPelaksanaan() { return tglPelaksanaan; }
    public int getKapasitasPeserta() { return kapasitasPeserta; }
    public String getNamaPemateri() { return namaPemateri; }
    public String getJenis() { return jenis; }

    public void berkurangKapasitas() {
        if (kapasitasPeserta > 0) {
            kapasitasPeserta--;
        }
    }

    public void bertambahKapasitas() {
        kapasitasPeserta++;
    }

    public boolean kesamaanWorkshop(Workshop lain) {
        return this.judul.equalsIgnoreCase(lain.judul)
                && this.tglPelaksanaan.equalsIgnoreCase(lain.tglPelaksanaan)
                && this.namaPemateri.equalsIgnoreCase(lain.namaPemateri)
                && this.jenis.equalsIgnoreCase(lain.jenis);
    }

    public abstract String getBonus();

    public abstract String getPesanBooking();

    public void tampilkanInfo() {
        System.out.println("[" + jenis + "] " + judul
                + " | Tanggal: " + tglPelaksanaan
                + " | Pemateri: " + namaPemateri
                + " | Kapasitas: " + kapasitasPeserta
                + " | Bonus: " + getBonus()
        );
    }
}

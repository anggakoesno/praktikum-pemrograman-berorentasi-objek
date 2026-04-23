package Pertemuan_8;

public class TechWorkshop extends Workshop {
    public TechWorkshop (String judul, String tglPelaksanaan, int kapasitasPeserta, String namaPemateri) {
        super(judul, tglPelaksanaan, kapasitasPeserta, namaPemateri, "TECH");
    }

    @Override
    public String getBonus() {
        return "Source code & akses repository GitHub eksklusif.";
    }

    @Override
    public String getPesanBooking() {
        return "Siapkan device dan nantikan sesi live coding TECH Workshop!";
    }
}


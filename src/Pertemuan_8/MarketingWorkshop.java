package Pertemuan_8;

public class MarketingWorkshop extends Workshop {
    public MarketingWorkshop (String judul, String tglPelaksanaan, int kapasitasPeserta, String namaPemateri) {
        super(judul, tglPelaksanaan, kapasitasPeserta, namaPemateri, "MARKETING");
    }

    @Override
    public String getBonus() {
        return "E-book strategi pemasaran digital dan akses webinar rekaman.";
    }

    @Override
    public String getPesanBooking() {
        return "Siapkan materi presentasi atau studi kasus untuk sesi MARKETING Workshop!";
    }
}


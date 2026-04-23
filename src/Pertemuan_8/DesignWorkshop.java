package Pertemuan_8;

public class DesignWorkshop extends Workshop {
    public DesignWorkshop (String judul, String tglPelaksanaan, int kapasitasPeserta, String namaPemateri) {
        super(judul, tglPelaksanaan, kapasitasPeserta, namaPemateri, "DESIGN");
    }

    @Override
    public String getBonus() {
        return "Template desain premium & file mockup PSD.";
    }

    @Override
    public String getPesanBooking() {
        return "Siapkan aplikasi atau tools untuk sesi DESIGN Workshop!";
    }
}

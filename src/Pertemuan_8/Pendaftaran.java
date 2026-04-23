package Pertemuan_8;

import java.util.UUID;

public class Pendaftaran {
    private String pendaftaranId;
    private Peserta peserta;
    private Workshop workshop;

    public Pendaftaran(Peserta peserta, Workshop workshop) {
        this.pendaftaranId = UUID.randomUUID().toString();
        this.peserta = peserta;
        this.workshop = workshop;
    }

    public String getPendaftaranId() { return pendaftaranId; }
    public Peserta getPeserta() { return peserta; }
    public Workshop getWorkshop() { return workshop; }

    @Override
    public String toString() {
        return "Registration ID: " + pendaftaranId
                + " | Peserta: " + peserta.getNama()
                + " | (" + peserta.getEmail() + ")"
                + " | Workshop: " + workshop.getJudul()
                + " | [" + workshop.getJenis() + "]"
                + " | Tanggal: " + workshop.getTglPelaksanaan()
                + " | Pemateri: " + workshop.getNamaPemateri();
    }
}

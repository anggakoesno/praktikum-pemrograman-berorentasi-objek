package Pertemuan_8;

import java.util.ArrayList;
import java.util.List;

public class SistemPendaftaranWorkshop {
    private List<Workshop> workshops;
    private List<Pendaftaran> pendaftarans;

    public SistemPendaftaranWorkshop() {
        workshops = new ArrayList<>();
        pendaftarans = new ArrayList<>();
    }

    public void tambahWorkshop(Workshop workshop) {
        workshops.add(workshop);
    }

    public void tampilkanWorkshopTersedia() {
        System.out.println("BERIKUT DAFTAR WORKHSOP YANG TERSEDIA SAAT INI");
        boolean ditemukan = false;

        for (Workshop workshop : workshops) {
            if (workshop.getKapasitasPeserta() > 0) {
                workshop.tampilkanInfo();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada workshop yang tersedia saat ini.");
        }
    }

    public void daftar(Peserta peserta, Workshop workshop) {
        for (Pendaftaran pendaftaran : pendaftarans) {
            if (pendaftaran.getPeserta().getEmail().equalsIgnoreCase(peserta.getEmail())
                    && pendaftaran.getWorkshop().kesamaanWorkshop(workshop)) {
                System.out.println("Pendaftaran gagal: Peserta dengan email "
                        + peserta.getEmail()
                        + " sudah mendaftar di workshop "
                        + workshop.getJudul());
                return;
            }
        }

        if (workshop.getKapasitasPeserta() <= 0) {
            System.out.println("Pemesanan gagal: kapasitas penuh untuk workshop "
                    + workshop.getJudul());
            return;
        }

        Pendaftaran pendaftaran = new Pendaftaran(peserta, workshop);
        pendaftarans.add(pendaftaran);
        workshop.berkurangKapasitas();

        System.out.println(peserta.getNama() + " berhasil didaftarkan ke workshop " + workshop.getJudul());
        System.out.println("Pesan '" + workshop.getPesanBooking() + "' berhasil dikirim ke email pendaftar");
    }

    public void batalPendaftaran (String email, Workshop workshop) {
        for (int i = 0; i < pendaftarans.size(); i++) {
            Pendaftaran pendaftaran = pendaftarans.get(i);

            if (pendaftaran.getPeserta().getEmail().equalsIgnoreCase(email)
                    && pendaftaran.getWorkshop().kesamaanWorkshop(workshop)) {
                pendaftaran.getWorkshop().bertambahKapasitas();
                pendaftarans.remove(i);
                System.out.println("Pendaftaran dibatalkan: " + pendaftaran);
                return;
            }
        }

        System.out.println("Tidak ditemukan pendaftaran dengan email " + email
                + " pada workshop " + workshop.getJudul());
    }

    public void getPendaftaransByEmail(String email) {
        boolean ditemukan = false;
        for (Pendaftaran pendaftaran : pendaftarans) {
            if (pendaftaran.getPeserta().getEmail().equalsIgnoreCase(email)) {
                if (!ditemukan) {
                    System.out.println("Berikut data pendaftaran untuk email: " + email);
                }
                System.out.println(pendaftaran);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Data pendaftaran untuk email: " + email + ", tidak ditemukan.");
        }
    }

    public void getPendaftaransByTgl(String tglCari) {
        System.out.println("Workshop tersedia pada tanggal " + tglCari);
        boolean ditemukan = false;

        for (Workshop workshop : workshops) {
            if (workshop.getTglPelaksanaan().equalsIgnoreCase(tglCari)
                    && workshop.getKapasitasPeserta() > 0) {
                workshop.tampilkanInfo();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada workshop yang tersedia pada tanggal " + tglCari);
        }
    }
}

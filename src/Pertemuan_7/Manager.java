package Pertemuan_7;

class Manager extends Karyawan {
    private String lokasi;

    public Manager (String nama, double gaji, String lokasi) {
        super(nama, 'M', gaji);
        this.lokasi = lokasi;
    }

    @Override
    public double getTHR() {
        double thr = 2 * gaji;
        if (lokasi.equalsIgnoreCase("Pusat")) {
            thr += gaji;
        } else if (lokasi.equalsIgnoreCase("Cabang")) {
            thr += 0.5 * gaji;
        }

        return thr;
    }
}

package Pertemuan_9;

class Manager extends Karyawan {
    private String lokasi;

    public Manager (String nama, double gaji, String lokasi, String jenisKelamin)
            throws DataTidakValidException {
        super(nama, 'M', gaji, jenisKelamin);
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
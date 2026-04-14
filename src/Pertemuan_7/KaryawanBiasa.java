package Pertemuan_7;

class KaryawanBiasa extends Karyawan {
    public KaryawanBiasa (String nama, double gaji) {
        super(nama, 'K', gaji);
    }

    @Override
    public double getTHR() {
        return gaji;
    }
}

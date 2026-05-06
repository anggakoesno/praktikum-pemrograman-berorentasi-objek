package Pertemuan_9;

class KaryawanBiasa extends Karyawan{
    public KaryawanBiasa (String nama, double gaji, String jenisKelamin)
            throws DataTidakValidException {
        super(nama, 'K', gaji, jenisKelamin);
    }

    @Override
    public double getTHR() {
        return gaji;
    }
}

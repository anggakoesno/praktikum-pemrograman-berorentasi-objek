package Pertemuan_9;

abstract class Karyawan implements Cuti {
    protected String nama;
    protected String nik;
    protected double gaji;
    protected String jenisKelamin;
    protected int jumlahCuti = 12;
    private static int otomatisK = 0;
    private static int otomatisM = 0;
    private static int otomatisS = 0;


    public Karyawan(String nama, char tipe, double gaji, String jenisKelamin) throws DataTidakValidException {
        if (gaji < 0) {
            throw new DataTidakValidException("Gaji tidak boleh negatif");
        }
        this.nama = nama;
        this.gaji = gaji;
        this.jenisKelamin = jenisKelamin;
        this.nik = buatNik(tipe);
    }

    private String buatNik(char tipe) {
        int nomor = 0;
        if (tipe == 'K') {
            nomor = ++otomatisK;
        } else if (tipe == 'M') {
            nomor = ++otomatisM;
        } else if (tipe == 'S') {
            nomor = ++otomatisS;
        }

        return String.format("%c-%03d", tipe, nomor);
    }

    @Override
    public void tambahCuti(int hari) {
        if (hari < 0) {
            throw new DataTidakValidException("Jumlah tambahan cuti tidak boleh negatif!");
        }

        this.jumlahCuti += hari;
    }

    @Override
    public void tambahCuti (String tipe) {
        if (tipe.equalsIgnoreCase("Pernikahan")) {
            this.jumlahCuti += 2;
        }

        else if (tipe.equalsIgnoreCase("Persalinan")) {
            if (this.jenisKelamin.equalsIgnoreCase("Wanita")) {
                this.jumlahCuti += 90;
            } else {
                this.jumlahCuti += 3;
            }
        }
    }

    public abstract double getTHR();

    public void showInfo() {
        String jenis = this.getClass().getSimpleName();
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Jenis Karyawan: " + jenis);
        System.out.println("Jatah Cuti: " + jumlahCuti + " hari");
        System.out.println("THR: Rp" + getTHR());
    }
}

interface Cuti {
    void tambahCuti(int hari) throws DataTidakValidException;
    void tambahCuti(String tipe);
}

interface TargetPenjualan {
    void setPenjualan(double jumlah) throws DataTidakValidException;
}

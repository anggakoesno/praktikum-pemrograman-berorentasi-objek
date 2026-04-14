package Pertemuan_7;

abstract class Karyawan {
    protected String nama;
    protected String nik;
    protected double gaji;
    private static int otomatisK = 0;
    private static int otomatisM = 0;
    private static int otomatisS = 0;


    public Karyawan(String nama, char tipe, double gaji) {
        this.nama = nama;
        this.nik = buatNik(tipe);
        this.gaji = gaji;
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

    public abstract double getTHR();

    public void showInfo() {
        String jenis = this.getClass().getSimpleName();
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Karyawan: " + jenis);
        System.out.println("THR: Rp" + getTHR());
    }
}

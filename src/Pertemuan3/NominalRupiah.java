package Pertemuan3;

public enum NominalRupiah {
    seratusRibu(100000),
    limaPuluhRibu(50000),
    duaPuluhRibu(20000),
    sepuluhRibu(10000),
    limaRibu(5000),
    duaRibu(2000),
    seribu(1000);

    private int nilai;

    NominalRupiah(int nilai) {
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }

    public static void main(String[] args) {
        NominalRupiah [] daftarNominal = NominalRupiah.values();

        int [] jumlahLembar = new int[daftarNominal.length];

        jumlahLembar[0] = 3;
        jumlahLembar[1] = 5;
        jumlahLembar[3] = 7;
        jumlahLembar[6] = 9;

        int totalNominal = 0;

        for (int i = 0; i < daftarNominal.length; i++) {
            int lembar = jumlahLembar[i];

            int subTotal = 0;
            if (lembar > 0) {
                subTotal = daftarNominal[i].getNilai() * lembar;
                totalNominal += subTotal;

                System.out.println("Nominal " + daftarNominal[i] + " x " + lembar + " lembar : " + subTotal);
            }

        }
        System.out.println("Total: " + totalNominal);
    }
}

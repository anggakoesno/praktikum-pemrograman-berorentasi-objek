package Latihan_PraUTS;

public class TransportasiDemo {
    public static void main(String[] args) {
        Transportasi[] transportasis = {
                new Taksi(1945, "Taksi", 7),
                new Bus(2134, "Bus"),
                new Taksi(7357, "Taksi", 5)
        };

        for (Transportasi tr : transportasis) {
            tr.tampilkanInfo();
        }
    }
}

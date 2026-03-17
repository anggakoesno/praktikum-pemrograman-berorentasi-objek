package Coba;

public class ProdukElektronik extends Produk {
    private int garansi;

    public ProdukElektronik(String nama, double harga, int garansi) {
        super(nama, harga);
        this.garansi = garansi;
    }
}

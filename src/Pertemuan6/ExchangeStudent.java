package Pertemuan6;

public class ExchangeStudent extends Student {
    public ExchangeStudent (String name) {
        super(name);
    }

    @Override
    public void study() {
        String tipe = this.getClass().getSimpleName();
        System.out.println(name + " (" + tipe + ")" + " is taking class at the school or host institution.");
    }
}

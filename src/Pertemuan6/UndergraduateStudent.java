package Pertemuan6;

public class UndergraduateStudent extends Student {
    public UndergraduateStudent (String name) {
        super(name);
    }

    @Override
    public void study() {
        String tipe = this.getClass().getSimpleName();
        System.out.println(name + " (" + tipe + ")" + " is doing active learning techniques.");
    }
}

package Pertemuan6;

public class GraduateStudent extends Student {
    public GraduateStudent (String name) {
        super(name);
    }

    @Override
    public void study() {
        String tipe = this.getClass().getSimpleName();
        System.out.println(name + " (" + tipe + ")" + " is doing passive learning to active research.");
    }
}

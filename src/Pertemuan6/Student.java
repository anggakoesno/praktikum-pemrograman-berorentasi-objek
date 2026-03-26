package Pertemuan6;

public class Student {
    protected String name;

    public Student(String name) {
        this.name = name;
    }

    public void study() {
        String tipe = this.getClass().getSimpleName();
        System.out.println(name + " (" + tipe + ")" + " is studying.");
    }
}

package Pertemuan6;

public class Tester extends Employee {
    public Tester (String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is testing the application.");
    }
}

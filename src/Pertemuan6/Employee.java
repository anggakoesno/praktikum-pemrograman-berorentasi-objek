package Pertemuan6;

public class Employee {
    protected String name;

    public Employee (String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is working in a general way.");
    }
}

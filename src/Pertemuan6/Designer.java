package Pertemuan6;

public class Designer extends Employee {
    public Designer (String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is creating UI design");
    }
}

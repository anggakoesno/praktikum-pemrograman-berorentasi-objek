package Pertemuan6;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Employee[] team = {
                new Programmer("Andi"),
                new Designer("Budi"),
                new Tester("Citra")
        };

        for (Employee emp : team) {
            emp.work();
        }
    }
}

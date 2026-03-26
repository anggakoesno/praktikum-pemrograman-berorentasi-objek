package Pertemuan6;

abstract class Worker {
    protected String name;
    protected double baseSalary;
    protected double totalSalary;

    public Worker(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.totalSalary = baseSalary;
    }

    public void showInfo() {
        String tipe = this.getClass().getSimpleName();
        System.out.println("Name: " + name);
        System.out.println("Tipe: " + tipe);
        System.out.println("Base salary: " + baseSalary);

        calculateSalary();

        System.out.println("Total salary: " + totalSalary);
        System.out.println();
    }

    public abstract void calculateSalary();
}

interface BonusEligible {
    void bonus(double jumlahBonus);
}

interface Taxable {
    void tax(double persentaseTax);
}

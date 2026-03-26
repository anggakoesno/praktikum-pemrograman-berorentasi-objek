package Pertemuan6;

class ContractWorker extends Worker implements Taxable {
    public ContractWorker (String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public void tax(double persentaseTax) {
        totalSalary -= (totalSalary * persentaseTax);
    }

    @Override
    public void calculateSalary() {
        totalSalary = baseSalary;
        tax(0.02);
    }
}

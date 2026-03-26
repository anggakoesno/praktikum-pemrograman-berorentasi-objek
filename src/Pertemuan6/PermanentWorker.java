package Pertemuan6;

class PermanentWorker extends Worker implements BonusEligible, Taxable {
    public PermanentWorker (String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public void bonus(double jumlahBonus) {
        totalSalary += jumlahBonus;
    }

    @Override
    public void tax(double persentaseTax) {
        totalSalary -= (totalSalary * persentaseTax);
    }

    @Override
    public void calculateSalary() {
        totalSalary = baseSalary;
        bonus(250000);
        tax(0.05);
    }
}

package Pertemuan6;

class ElectricCar extends Vehicle implements Electric {
    public ElectricCar(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println(name + " moves silently using electric power.");
    }

    @Override
    public void chargeBattery() {
        System.out.println(name + " battery is charging.");
    }
}

package Pertemuan6;

class Drone extends Vehicle implements Electric, Flyable {
    public Drone(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println(name + " moves by rotating propellers.");
    }

    @Override
    public void chargeBattery() {
        System.out.println(name + " battery is charging.");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying in the air.");
    }
}

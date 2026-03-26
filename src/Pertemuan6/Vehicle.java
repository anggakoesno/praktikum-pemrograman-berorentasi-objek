package Pertemuan6;

abstract class Vehicle {
    protected String name;
    protected int maxSpeed;

    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void showBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Max Speed: " + maxSpeed + "km/h");
    }

    public void startEngine() {
        System.out.println(name + " engine is started.");
    }

    public abstract void move();
}

interface Electric {
    void chargeBattery();
}

interface Flyable {
    void fly();
}

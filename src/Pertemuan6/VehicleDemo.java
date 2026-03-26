package Pertemuan6;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Toyota", 180),
                new ElectricCar("Tesla Model 3", 225),
                new Drone("DJI Phantom", 72)
        };

        for (Vehicle v : vehicles) {
            v.showBasicInfo();
            v.startEngine();
            v.move();

            if (v instanceof Electric) {
                ((Electric) v).chargeBattery();
            }

            if (v instanceof Flyable) {
                ((Flyable) v).fly();
            }

            System.out.println();
        }
    }
}

package Pertemuan6;

class Car extends Vehicle{
    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println(name + " moves on the road.");
    }
}

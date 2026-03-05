package Pertemuan4;

public class Person {
    protected String address;

    public void setAddress(String address) {
        this.address = address;
    }

    protected void sayAddress() {
        System.out.println("My address is " + address);
    }

}
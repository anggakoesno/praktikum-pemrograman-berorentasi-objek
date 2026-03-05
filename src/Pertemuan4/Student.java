package Pertemuan4;

public class Student extends Person {
    public void introduce() {
        address = "Solo";
        sayAddress();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

package Pertemuan6;

public class StudentDemo {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Andi"),
                new UndergraduateStudent("Bayu"),
                new GraduateStudent("Cahyo"),
                new ExchangeStudent("Dono")
        };

        for (Student s : students) {
            s.study();
        }
    }
}

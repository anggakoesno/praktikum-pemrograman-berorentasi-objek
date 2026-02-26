package Pertemuan3;

public class Student {
    String nama;

    static int umur = 22;

    public static void main(String[] args) {
        Student studentA = new Student();
        studentA.nama = "Revan";
        System.out.println(studentA.nama);
        System.out.println(studentA.umur);
        Student studentB = new Student();
        studentB.nama = "Arya";
        System.out.println(studentB.nama);
        System.out.println(studentB.umur);
        studentB.umur = 25;
        System.out.println(studentA.umur);
        System.out.println(studentB.umur);
    }
}

package Pertemuan4;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAddress("Jogja");
        person.sayAddress();

        Student siswa = new Student();
        siswa.introduce();

        siswa.setAge(18);
        System.out.println("Age: " + siswa.getAge());

        Book buku1 = new Book("Judul 1", "Penulis 1");
        buku1.borrowBook();
        System.out.println(buku1.isBookBorrowed());
        buku1.returnBook();
        System.out.println(buku1.isBookBorrowed());
    }
}

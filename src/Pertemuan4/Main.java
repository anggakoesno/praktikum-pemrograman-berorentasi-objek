package Pertemuan4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setAddress("Jogja");
//        person.sayAddress();
//
//        Student siswa = new Student();
//        siswa.introduce();
//
//        siswa.setAge(18);
//        System.out.println("Age: " + siswa.getAge());
//
//        Book buku1 = new Book("Judul 1", "Penulis 1");
//        buku1.borrowBook();
//        System.out.println(buku1.isBookBorrowed());
//        buku1.returnBook();
//        System.out.println(buku1.isBookBorrowed());
//
//        Saving acct1 = new Saving("123", 1000, 3);
//        System.out.println(acct1);
//
//        Checking acct2 = new Checking("456", 2000, 10000);
//        System.out.println(acct2);
//
//        Deposit acct3 = new Deposit("789", 2500, LocalDate.of(2026, 3, 5));
//        System.out.println(acct3);

        // Latihan 1: Inheritance Pegawai
        Direktur direktur1 = new Direktur (
                "Direktur 1", 55, 7000000, 9000000
        );
        System.out.println(direktur1);

        Manajer manajer1 = new Manajer (
                "Manajer 1", 48, 5000000, "Pembangunan", 7000000
        );
        System.out.println(manajer1);

        Supervisor supervisor1 = new Supervisor (
                "Supervisor 1", 45, 4500000, 3500000
        );
        System.out.println(supervisor1);

        Operasional operasional1 = new Operasional (
                "Operasional 1", 40, 4000000, 3000000
        );
        System.out.println(operasional1);

    }
}

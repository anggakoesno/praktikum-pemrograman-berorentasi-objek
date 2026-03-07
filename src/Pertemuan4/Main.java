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
//        Direktur direktur1 = new Direktur (
//                "Direktur 1", 55, 7000000, 9000000
//        );
//        System.out.println(direktur1);
//
//        Manajer manajer1 = new Manajer (
//                "Manajer 1", 48, 5000000, "Pembangunan", 7000000
//        );
//        System.out.println(manajer1);
//
//        Supervisor supervisor1 = new Supervisor (
//                "Supervisor 1", 45, 4500000, 3500000
//        );
//        System.out.println(supervisor1);
//
//        Operasional operasional1 = new Operasional (
//                "Operasional 1", 40, 4000000, 3000000
//        );
//        System.out.println(operasional1);

        // Latihan 2: Akun Bank
//        AkunBank akun1 = new AkunBank("Akun 1", 100000);
//
//        System.out.println("Pemilik Rekening: " + akun1.getPemilik());
//        System.out.println("Saldo Awal: Rp" + akun1.getSaldo());
//
//        akun1.deposit(50000);
//        akun1.withdraw(30000);
//        akun1.withdraw(200000);
//        akun1.deposit(0);
//        akun1.withdraw(0);
//
//        akun1.setSaldo(-99);
//
//        System.out.println("Saldo Akhir: Rp" + akun1.getSaldo());

        // Latihan 3: Game RPG
        Warrior W1 = new Warrior("Afif");
        Tank T1 = new Tank("Virza");
        Archer A1 = new Archer("Valdo");

        W1.DisplayInfo();
        T1.DisplayInfo();
        A1.DisplayInfo();

        System.out.println("PHASE 1");
        W1.Attack(T1);
        T1.Heal();
        A1.Attack(W1);

        System.out.println("\nPHASE 2");
        W1.Berserk();
        T1.Taunt();
        A1.doubleShot(W1);
    }
}

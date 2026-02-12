package Pertemuan1;

import java.util.Scanner;

public class LatihanInput {
    public static void main(String[] args) {
        // ------ Latihan 3 ------
        Scanner tes = new Scanner(System.in).useDelimiter("\\s*-\\s*");

        System.out.println("Inputkan 3 string yang diikuti '-' tiap kata:");

        System.out.println(tes.next());
        System.out.println(tes.next());
        System.out.println(tes.next());

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Inputkan 3 string yang diikuti '-' tiap kata: ");
//        String inputan = scanner.nextLine();
//
//        Scanner pisah = new Scanner(inputan);
//        pisah.useDelimiter("-");
//
//        while (pisah.hasNext()) {
//            System.out.println(pisah.next());
//        }
//
//        pisah.close();

        // Scanner scanner =  new Scanner(System.in);
        // System.out.print("Isi bebas: ");
        // String isi = scanner.nextLine();
        // System.out.println("Isianmu: " + isi);

        //        Scanner scanner = new Scanner(System.in);
        //        String inputan;
        //        String[] hasil;
        //
        //        System.out.print("Inputkan 3 string yang diikuti '-' tiap kata: ");
        //        inputan = scanner.nextLine();
        //        System.out.println(inputan);
        //        hasil = inputan.split("-");
        //
        //        for (String kata : hasil) {
        //            System.out.println(kata);
        //        }

    }
}

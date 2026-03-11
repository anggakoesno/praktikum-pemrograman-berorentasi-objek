package Pertemuan5_PBO;

public class Main {
    public static void main(String[] args) {
        Emoney flazzy1 = new Flazzy("F1", 0, "Edition F1");
        Emoney opalo1 = new Opalo("O1", 0, "Edition O1", true);

        System.out.println("Saldo awal flazzy1: Rp" + flazzy1.balance);
        System.out.println("Saldo awal opalo1: Rp" + opalo1.balance + "\n");

        System.out.println("FLAZZY TOP UP");
        flazzy1.topUp(70000);

        System.out.println();

        System.out.println("OPALO TOP UP (PERIODE PROMOSI)");
        opalo1.topUp(70000);

        System.out.println();

        System.out.println("FLAZZY PAY");
        flazzy1.pay(30000);

        System.out.println();

        System.out.println("OPALO PAY");
        opalo1.pay(30000);

        System.out.println();

        System.out.println("Saldo akhir flazzy1: Rp" + flazzy1.balance);
        System.out.println("Saldo akhir opalo1: Rp" + opalo1.balance);
    }
}

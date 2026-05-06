package Pertemuan_9;

public class ArithmeticException {
    public static void main(String[] args) {
        int total = 100;
        int pembagi = 0;
//        System.out.println(total/pembagi);

        try {
            int hasil = total / pembagi;
            System.out.println("Hasil = " + hasil);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Pembagi tidak boleh bernilai 0.");
        }
    }
}

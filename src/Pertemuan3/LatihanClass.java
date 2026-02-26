package Pertemuan3;

public class LatihanClass {
    public static void main(String[] args) {
        LatihanClass.printedData(0, "Data1", "Data2", "Data3");
    }

    public static void printedData(int number, String... varg) {
        System.out.println(number);
        for (String data : varg) {
            System.out.println(data);
        }
    }
}

package Pertemuan3;

public class LatihanClass {
    public static void main(String[] args) {
        // LatihanClass.printedData(0, "Data1", "Data2", "Data3");

        Game darts = new Game();
        Game pinball = new Game(20);
        System.out.println("Score darts: " + darts.score);
        System.out.println("Score pinball: " + pinball.score);
    }

    public static void printedData(int number, String... varg) {
        System.out.println(number);
        for (String data : varg) {
            System.out.println(data);
        }
    }
}

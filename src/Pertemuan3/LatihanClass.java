package Pertemuan3;

public class LatihanClass {
    public enum Shape {CIRCLE, RECTANGLE,TRIANGLE}

    public static void main(String[] args) {
        System.out.println(Shape.valueOf("CIRCLE"));
        System.out.println(Shape.valueOf("RECTANGLE").ordinal()); // method .ordinal() untuk mendapatkan index dari nilai tersebut
        Shape shape2 = Shape.RECTANGLE;
        switch (shape2) {
            case CIRCLE:
                System.out.println("Lingkaran");
                break;
            case RECTANGLE:
                System.out.println("Kotak");
                break;
            case TRIANGLE:
                System.out.println("Segitiga");
                break;
        }
        // LatihanClass.printedData(0, "Data1", "Data2", "Data3");

        Game darts = new Game();
        Game pinball = new Game(20);
        System.out.println("Score darts: " + darts.score);
        System.out.println("Score pinball: " + pinball.score);

        Lingkaran L1 = new Lingkaran(4);
        // System.out.println("Lingkaran L1 berjari-jari: " + L1.jari2);
        // System.out.println("Lingkaran L1 luasnya: " + L1.getLuas());
        // System.out.println("Lingkaran L1 kelilingnya: " + L1.getKeliling());
        // System.out.println("Hasil print L1 :\n" + L1);

        DayOfWeek hari = DayOfWeek.Sabtu;
        System.out.println(hari.isWeekend());
        System.out.println(DayOfWeek.Selasa.isWeekend());
    }

    public enum DayOfWeek{
        Senin, Selasa, Rabu, Kamis, Jumat, Sabtu, Minggu;
        public boolean isWeekend(){
            return this == Sabtu || this == Minggu;
        }
    }

    public static void printedData(int number, String... varg) {
        System.out.println(number);
        for (String data : varg) {
            System.out.println(data);
        }
    }
}

package Pertemuan_9;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] hoursWorked = {7, 8, 7, 9, 5};

        try {
            for (int i = 0; i <= hoursWorked.length; i++) {
                System.out.println(hoursWorked[i]);
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Index melebihi batas array.");
        }
    }
}

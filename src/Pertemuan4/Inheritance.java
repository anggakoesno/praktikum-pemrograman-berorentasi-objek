package Pertemuan4;

public class Inheritance {

    static class Animal {
        public void sleep() {
            System.out.println("Zzzzz");
        }
    }

    static class Sheep extends Animal {
        @Override
        public void sleep() {
            System.out.println("Sheep not sleep yet");
        }
        public void animalSound() {
            System.out.println("The sheep says: mbee mbee");
        }
    }

    public static void main(String[] args) {
        Animal hewan1 = new Animal();
        hewan1.sleep();
        Sheep domba1 = new Sheep();
        domba1.sleep();
        domba1.animalSound();
    }

}

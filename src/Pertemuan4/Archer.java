package Pertemuan4;

public class Archer extends Entity {
    public Archer (String nama) {
        this.nama = nama;
        this.health = 10;
        this.damage = 15;
        this.defense = 1;
    }

    public void doubleShot(Entity target) {
        System.out.println(this.nama + " : RASAKAN DOUBLE SHOT KU");
        Attack(target);
        Attack(target);
    }
}

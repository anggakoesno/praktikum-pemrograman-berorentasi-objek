package Pertemuan4;

public class Warrior extends Entity {
    public Warrior (String nama) {
        this.nama = nama;
        this.health = 15;
        this.damage = 10;
        this.defense = 3;
    }

    public void Berserk() {
        this.damage += 5;
        System.out.println(this.nama + " : BERSERRKK!!, damage bertambah 5");
    }
}

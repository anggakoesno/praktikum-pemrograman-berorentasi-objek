package Pertemuan4;

public class Tank extends Entity {
    public Tank (String nama) {
        this.nama = nama;
        this.health = 20;
        this.damage = 5;
        this.defense = 5;
    }

    public void Taunt() {
        this.defense += 5;
        System.out.println(this.nama + " : TAUNTT!!, defense bertambah 5");
    }
}

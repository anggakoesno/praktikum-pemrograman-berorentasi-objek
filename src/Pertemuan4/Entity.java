package Pertemuan4;

public class Entity {
    protected String nama;
    protected int health;
    protected int damage;
    protected int defense;

    public void Attack(Entity target) {
        if (target.health <= 0) {
            System.out.println("Target ( " + target.nama + " ) sudah mati");
        } else {
            int nilaiDamage = this.damage - target.defense;
            if (nilaiDamage < 0) {
                nilaiDamage = 0;
            }
            target.health -= nilaiDamage;
            System.out.println(this.nama + " : Berhasil menyerang " + target.nama +
                    ", sisa health " + target.nama + " = " + target.health);
        }
    }

    public void Heal() {
        this.health += 5;
        System.out.println(this.nama + " : Berhasil melakukan heal, " +
                "nyawamu sekarang = " + this.health);
    }

    public void DisplayInfo() {
        System.out.println("Nama = " + this.nama);
        System.out.println("Class = " + this.getClass().getSimpleName());
        System.out.println("Health = " + this.health);
        System.out.println("Damage = " + this.damage);
        System.out.println("Defense = " + this.defense);
        System.out.println("==============================\n");

    }
}

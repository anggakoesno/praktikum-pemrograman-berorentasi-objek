package Pertemuan_8;

public class WorkshopSystem {
    public static void main(String[] args) {
        SistemPendaftaranWorkshop system = new SistemPendaftaranWorkshop();

        Workshop techWorkshop = new TechWorkshop("Java Fundamentals", "10-APR-2025", 2, "Budi Santoso");
        Workshop designWorkshop = new DesignWorkshop("UI/UX Design", "15-APR-2025", 3, "Siti Aminah");
        Workshop marketingWorkshop = new MarketingWorkshop("Digital Marketing", "20-APR-2025", 1, "Rina Wijaya");
        Workshop mobileWorkshop = new TechWorkshop("Android Development", "25-APR-2025", 4, "Dimas Arief");

        system.tambahWorkshop(techWorkshop);
        system.tambahWorkshop(designWorkshop);
        system.tambahWorkshop(marketingWorkshop);
        system.tambahWorkshop(mobileWorkshop);

        system.tampilkanWorkshopTersedia();
        System.out.println("--------------------------------------------------------------------------------");

        Peserta ali = new Peserta("Ali", "ali@gmail.com");
        Peserta bella = new Peserta("Bella", "bella@gmail.com");
        Peserta chika = new Peserta("Chika", "chika@gmail.com");
        Peserta dino = new Peserta("Dino", "dino@gmail.com");


        system.daftar(ali, techWorkshop);
        system.daftar(bella, techWorkshop);
        system.daftar(dino, marketingWorkshop);
        system.daftar(chika, techWorkshop); // seharusnya gagal karena kapasitas penuh
        system.daftar(chika, marketingWorkshop); // seharusnya gagal karena kapasitas penuh
        system.daftar(chika, marketingWorkshop); // seharusnya gagal larena sudah pernah daftar

        System.out.println("--------------------------------------------------------------------------------");
        system.tampilkanWorkshopTersedia();
        System.out.println("--------------------------------------------------------------------------------");

        system.batalPendaftaran("ali@gmail.com", techWorkshop);
        system.batalPendaftaran("bella@gmail.com", techWorkshop);
        system.batalPendaftaran("chika@gmail.com", techWorkshop);

        System.out.println("--------------------------------------------------------------------------------");
        system.tampilkanWorkshopTersedia();
        System.out.println("--------------------------------------------------------------------------------");

        // OPSIONAL
        System.out.println("\nOUTPUT OPSIONAL");
        system.getPendaftaransByEmail("ali@gmail.com");
        system.getPendaftaransByEmail("bella@gmail.com");
        system.getPendaftaransByEmail("chika@gmail.com");
        system.getPendaftaransByEmail("dino@gmail.com");

        System.out.println("--------------------------------------------------------------------------------");
        system.getPendaftaransByTgl("10-APR-2025");
        system.getPendaftaransByTgl("30-APR-2025");
    }
}

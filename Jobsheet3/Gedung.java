public class Gedung {
    String namaGedung;
    int kapasitas, harga;

    public void DisplayInfo(){
        System.out.println("\n=================================");
        System.out.println("Nama Gedung: " + namaGedung);
        System.out.println("Kapasitas Gedung: " + kapasitas);
        System.out.println("Harga Gedung: " + harga);
        System.out.println("=================================");
    }
}

import java.util.*;

public class ParkirMallMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemParkir sistemParkir = new SistemParkir();

        int menu = -1;
        while (menu != 0) {
            System.out.println("Menu:");
            System.out.println("1. Input data");
            System.out.println("2. Cari data");
            System.out.println("3. Lihat data");
            System.out.println("4. Laporan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Tipe kendaraan(mobil/motor): ");
                    String tipe = sc.next();
                    System.out.print("Plat nomor: ");
                    String nomorPlat = sc.next();
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    sistemParkir.inputData(tipe, nomorPlat, durasi);
                    break;
                case 2:
                    System.out.print("No plat: ");
                    String cariNomorPlat = sc.next();
                    sistemParkir.cariData(cariNomorPlat);
                    break;
                case 3:
                    sistemParkir.lihatData();
                    break;
                case 4:
                    sistemParkir.generateLaporan();
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        } sc.close();
    }
}
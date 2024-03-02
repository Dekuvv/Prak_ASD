import java.util.Scanner;
public class PelangganMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pelanggan pelanggan = new Pelanggan();

        System.out.print("Masukkan Nama : ");
        pelanggan.namaPelanggan = sc.nextLine();
        System.out.print("Acara yang akan digelar: ");
        pelanggan.acara = sc.nextLine();
        System.out.print("Masukkan Nomor Telepon: ");
        pelanggan.nomorTelepon = sc.nextLine();
        System.out.print("Masukkan Jumlah Tamu: ");
        pelanggan.jumlahTamu = sc.nextInt();
        
        pelanggan.tampilkanPesanan();
        sc.close();
    }
}

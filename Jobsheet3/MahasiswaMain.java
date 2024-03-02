import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        // Looping untuk memasukkan data mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + i);
            scanner.nextLine(); 

            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin (P/L): ");
            char jenisKelamin = scanner.nextLine().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = scanner.nextDouble();

            // Membuat objek Mahasiswa dan menambahkannya ke ArrayList
            Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jenisKelamin, ipk);
            mahasiswaList.add(mahasiswa);
        }

        // Menampilkan data mahasiswa menggunakan loop FOREACH
        for (int i = 0; i < mahasiswaList.size(); i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            Mahasiswa mahasiswa = mahasiswaList.get(i);
            mahasiswa.printData();
        }

        // Menghitung rata-rata IPK
        double totalIPK = 0;
        for (Mahasiswa mahasiswa : mahasiswaList) {
            totalIPK += mahasiswa.getIpk();
        }
        double rataRataIPK = totalIPK / jumlahMahasiswa;

        // Menampilkan rata-rata IPK
        System.out.println("\nRata-rata IPK : " + rataRataIPK);

        scanner.close();
    }
}

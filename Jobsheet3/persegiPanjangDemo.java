import java.util.Scanner;

public class persegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        persegiPanjang[] arrayOfPersegiPanjang = new persegiPanjang[3];
        int panjang, lebar;

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new persegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: " + arrayOfPersegiPanjang[i].panjang
            + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
            sc.close();
        }
    }
}
package Jobsheet13;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Sorting
 */
public class Sorting {

    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);

        

    }
}
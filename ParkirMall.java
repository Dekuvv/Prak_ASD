import java.util.*;

class Kendaraan {
    String tipe;
    String nomorPlat;
    int durasi;
    int biaya;

    public Kendaraan(String tipe, String nomorPlat, int durasi) {
        this.tipe = tipe;
        this.nomorPlat = nomorPlat;
        this.durasi = durasi;
        hitungBiaya();
    }

    private void hitungBiaya() {
        if (tipe.equalsIgnoreCase("mobil")) {
            biaya = 3000 * durasi;
        } else if (tipe.equalsIgnoreCase("motor")) {
            biaya = 1000 * durasi;
        }
    }

    public String toString() {
        return "Tipe: " + tipe + ", Nomor Plat: " + nomorPlat + ", Durasi: " + durasi + " jam, Biaya: " + biaya;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public int getBiaya() {
        return biaya;
    }

    public String getTipe() {
        return tipe;
    }
}

class SistemParkir {
    ArrayList<Kendaraan> kendaraanList = new ArrayList<>();

    public void inputData(String tipe, String nomorPlat, int durasi) {
        Kendaraan kendaraan = new Kendaraan(tipe, nomorPlat, durasi);
        kendaraanList.add(kendaraan);
        System.out.println("Biaya: " + kendaraan.biaya);
        System.out.println();
    }

    public void cariData(String nomorPlat) {
        boolean found = false;
        for (Kendaraan kendaraan : kendaraanList) {
            if (kendaraan.getNomorPlat().equalsIgnoreCase(nomorPlat)) {
                System.out.println(kendaraan);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void lihatData() {
        for (int i = 0; i < kendaraanList.size() - 1; i++) {
            for (int j = 0; j < kendaraanList.size() - i - 1; j++) {
                if (kendaraanList.get(j).getBiaya() < kendaraanList.get(j + 1).getBiaya()) {
                    Kendaraan temp = kendaraanList.get(j);
                    kendaraanList.set(j, kendaraanList.get(j + 1));
                    kendaraanList.set(j + 1, temp);
                }
            }
        }

        for (Kendaraan kendaraan : kendaraanList) {
            System.out.println(kendaraan);
        }
    }

    public void generateLaporan() {
        int totalMobil = 0;
        int totalMotor = 0;

        for (Kendaraan kendaraan : kendaraanList) {
            if (kendaraan.getTipe().equalsIgnoreCase("mobil")) {
                totalMobil += kendaraan.getBiaya();
            } else if (kendaraan.getTipe().equalsIgnoreCase("motor")) {
                totalMotor += kendaraan.getBiaya();
            }
        }

        System.out.println("Total pendapatan:");
        System.out.println("Mobil: " + totalMobil);
        System.out.println("Motor: " + totalMotor);
    }
}

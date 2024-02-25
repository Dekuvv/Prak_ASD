package Jobsheet2;

public class Sepeda {
    float kecepatan;
    int gear;
    public Sepeda(){

    }
    public Sepeda(float newKecepatan, int newGear){
        kecepatan = newKecepatan;
        gear = newGear;
    }
    public void tambahKecepatan(float increment){
        kecepatan += increment;
        if (kecepatan>20) {
            System.out.println("kenceng bet");
            kecepatan=20;
        }
    }
    public void kurangiKecepatan(float decrement){
        kecepatan -= decrement;
        if (kecepatan<0) {
            kecepatan=0;
        }
    }
    public void cetakInfo(){
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("=====================");
    }
}

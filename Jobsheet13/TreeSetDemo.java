package Jobsheet13;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");

        for (String temp : fruits){
            System.out.println(temp);
        }

        for (String temp : fruits){
            System.out.println(temp);
        }

        System.out.println("First: " + fruits.first());
        System.out.println("Last: " + fruits.last());

        fruits.remove("Jeruk");
        System.out.println("Setelah remove " + fruits);
        
        fruits.pollFirst();
        System.out.println("Setelah Poll first " + fruits);

        fruits.pollLast();
        System.out.println("Setelah poll last " + fruits);
    }
}

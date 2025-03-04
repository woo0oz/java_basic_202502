package oop.inherit.practice;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television( "Samsung", "Samsung TV", 2000000, 55);
        Smartphone phone = new Smartphone("iPhone 13", "Apple", 890000,256);

        System.out.println("TV Info:");
        tv.displayInfo();

        System.out.println("\nSmartphone Info:");
        phone.displayInfo();
    }
}

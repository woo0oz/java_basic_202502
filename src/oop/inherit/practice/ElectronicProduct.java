package oop.inherit.practice;

public class ElectronicProduct {
    public String manufacturer;
    public String productName;
    public double price;

    public ElectronicProduct(String manufacturer, String productName, double price) {
        this.manufacturer = manufacturer;
        this.productName = productName;
        this.price = price;
    }

    public void displayInfo() {
        System.out.printf("%s , 가격 :  %.0f원,  제조사 : %s\n", this.productName, this.price, this.manufacturer );  // %.0f  => 소숫점이 노출되지 않음

    }



}

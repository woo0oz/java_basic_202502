package oop.static_.practice;

public class Product {
    String productName;
    int price;

    // 생성자
    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    // 메서드
    public void sellProduct() {
        Store.addSale(this.price); // Store 클래스의 addSale 메서드
    }


}

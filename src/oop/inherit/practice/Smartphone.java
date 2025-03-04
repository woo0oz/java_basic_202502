package oop.inherit.practice;

public class Smartphone extends ElectronicProduct {

    int storageCapacity;

    // 생성자
    public Smartphone(String manufacturer, String productName, int price, int storageCapacity ) {
        super(manufacturer, productName, price); // 부모가 초기화 해줄 수 있는 부분은 super 로 넘긴다.
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("저장용량 : %d GB", this.storageCapacity);
    }
}


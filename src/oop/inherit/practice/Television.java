package oop.inherit.practice;

public class Television extends ElectronicProduct {
    
    int screenSize ; 
    // 부모가 초기화 해줄수는 없음
    // 자식의 고유 속성

    public Television(String manufacturer, String productName, int price, int screenSize) {
        super(manufacturer, productName, price);
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // 그대로 유지
        System.out.printf("Screen Size : %d  inches" , this.screenSize);
    }


}

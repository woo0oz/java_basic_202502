package oop.basic;

public class Pen {
    // 객체 설계용 클래스는  main 메서드가 없다 !
    // main 메서드는 실행을 위해서만 필요!

    // 객체의 속성을 표현 -> 필드(멤버변수) 라고 부름
    String color;
    int price;


    // 객체의 기능을 표현한 함수를 메서드라고 부른다.
    //
    void write() { // static 없어도 됨 
        System.out.println(color + "색 글을 씁니다");
    }

    void priceInfo() {
        System.out.println(color + "색의 가격은 " + price + " 원 입니다.");
    }



}

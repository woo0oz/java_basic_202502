package oop.constructor;

public class Phone {  // 객체 생성용 class
    Phone(){ // 기본 생성자 (매개변수 없음)
        System.out.println("기본 생성자 호출");  // 앞으로 객체 생성시 실행할 로직을 작성
        model = "폴더폰";
        color = "파랑색";
        price = 200000;
    }

    Phone(String pModel) { // pModel을 전달받는 생성자  (생성자의 overloading)
        System.out.println("2번 생성자 호출");  //
        model = pModel;
        color = "화이트";
        price = 10000000;
    }

    Phone(String pModel, String pColor) { // pModel을 전달받는 생성자  (생성자의 overloading)
        System.out.println("3번 생성자 호출");  //
        model = pModel;
        color = pColor;
        price = 12000000;
    }

     /*
     # 생성자 오버로딩 (중복 선언)

     1. 생성자는 중복해서 여러 개 선언이 가능합니다.
     2. 단, 생성자의 매개변수의 타입, 개수, 순서 중 하나가 달라야
        중복을 인정합니다.
     */

    String model;
    String color;
    int price;

    void showSpec(){
        System.out.println("*** 휴대폰의 정보 ***");
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price + " 원");
    }


}

package oop.basic;

public class Main {  // class 이름이 main 입니다.
    public static void main(String[] args) {  // main 메서드 입니다.

        /*
            설계도에 작성한 속성과 기능을 사용하려면
            반드시 실체(객체)를 생성하셔야  합니다.
            클래스 만 제작된 채로는 아무 기능도 수행할 수 없다.
         */

         // new Pen() -> 클래스 설계도대로 객체를 새로 만들어주세요.
         // Pen redPen -> Pen 타입의 redPen 변수에 넣는다. (Pen 타입이 기본 타입은 아니고 객체 타입임)

        Pen redPen = new Pen();
        Pen bluePen = new Pen();

        // 참조 연산자(.) 를 통해 객체로 접근한 후
        // 속성을 지정하고 기능을 사용할 수 있습니다.
        redPen.color = "빨강";
        redPen.price = 500;

        bluePen.color = "파랑";
        bluePen.price = 800;

        redPen.write();
        redPen.priceInfo();


        bluePen.write();
        bluePen.priceInfo();

        System.out.println(redPen);
        System.out.println(bluePen);






    }
}

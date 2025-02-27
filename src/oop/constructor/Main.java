package oop.constructor;

public class Main {
    public static void main(String[] args) {

         /*
     # 생성자 (Constructor)

     1. 생성자는 객체를 생성하는 역할을 하며, 그렇기 때문에
      클래스 내부에 반드시 하나 이상 존재해야 합니다.

     2. 만약 생성자가 하나도 존재하지 않는다면 JVM이 자동으로
      매개변수가 하나도 존재하지 않는 가장 기본 형태의 생성자를
      (default constructor)를 하나 만들어 줍니다.

     3. 생성자는 반드시 클래스 이름과 대/소문자까지 동일하게
      작성하여 선언하고, 리턴 타입이 존재하지 않습니다.

     4. 생성자 내부에는 객체가 생성되자마자 해야 할 로직들을
      기술할 수 있습니다.
     */

        Phone basic = new Phone();
        // Phone 생성자를 통해  객체를 생성했고, 해당 객체의 주소값을 basic 에 저장했다는 얘기!!

        basic.showSpec();

        System.out.println("====================");

        Phone galaxy = new Phone("갤럭시 25");
        galaxy.showSpec();

        Phone iPhone = new Phone("아이폰 16", "스페이스 그레이");
        iPhone.showSpec();

    }
}

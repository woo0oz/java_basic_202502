package etc.exception.throws_;

public class ThrowsExample {

     /*
     # throws
     - throws는 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
      예외 처리를 메서드의 호출부로 떠넘기는 방식입니다.

     - throws는 생성자에서도 선언이 가능하며, 메서드나 생성자를 호출 시
      예외 처리를 강요하고 싶을 때 사용합니다.

     - 또한, 원하는 영역으로 예외를 모아서 한번에 처리하는 것도 가능합니다.
     */

    static String[] greetings = {"안녕","Hello","니하오"};

    static void greet(int idx) throws Exception { // 에외 처리 강제
        System.out.println(greetings[idx]);
    }

    
    public static void main(String[] args) {  // main에서 throws 를 쓰는건 예외 처리 안하겠다는 것과 똑같음 !

        try {
            greet(20);
        } catch (Exception e) {
            System.out.println("메서드의 매개값이 잘못되었어요!");;
        }
    }
}

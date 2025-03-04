package etc.exception.basic;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("정수1: ");
        int i = scanner.nextInt();

        System.out.println("정수2: ");
        int j = scanner.nextInt();

        try {
            System.out.printf("%d / %d  = %d \n", i, j, i/j );
        }   catch (Exception e) { // 예외 상황이 생기면 : 예외 객체가 생성됨   Exception : 웬만한 예외의 부모
            // catch (ArithmethicException e) {   // ArithmethicException 클래스 를 지정해도 동작은 함
            System.out.println("0으로 나눌 수 없습니다");  //
            e.printStackTrace(); // 예외의 원인을 역추적해서 띄워주는 메서드
        }
            //



        System.out.println("프로그램 정상 종료!");

    }

}

package basic.constate;

import java.util.Scanner;

public class SwitchQuiz {
       /*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요. (+, -, *, /)
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
         만약, 사용자가 나눗셈을 선택 했을 때 0으로 나누려는 시도를 한다면
         연산할 수 없는 입력값이라고 얘기 해 주세요.
        */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요");
        int num1 = sc.nextInt();

//        Scanner sc = new Scanner(System.in);  // 입력 타입별로 다른 스캐너를 써야하는가>?
        System.out.println("연산자를 입력하세요 : ");
        String operator = sc.next();

        System.out.println("두번째 정수를 입력하세요");
        int num2 = sc.nextInt();
        int result = 0;
        boolean flag = false;

        switch (operator) {
            case  "+" :
                result = num1 + num2 ;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("연산할 수 없는 입력값입니다");
                    flag = true;
                } else {
                    result = num1 / num2;
                }
                break;

            default:
                System.out.println("연산자를 제대로 입력하세요");
        }


        if (!flag) {  // flag == false
            System.out.printf("%d %s %d = %d \n", num1, operator, num2, result);
        }

    }
}
  //  혹은 변수 result  을 통해 출력, 이때는 result =0 을 통해서 초기화 하는게 좋음
  //  모든 케이스에서 result 값이 존재해야하기 떄문.

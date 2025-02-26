package basic.loop;

import java.util.Scanner;

public class InfiniteLoopQuiz {
    public static void main(String[] args) {

          /*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		  지속적으로 문제를 출제한 후 정답을 입력받으세요.
		  사용자가 0을 입력하면 반복문을 탈출시키세요.

		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */

        Scanner sc = new Scanner(System.in);

        int right_cnt = 0;
        int wrong_cnt = 0;

        while (true) {

            int rm1 = (int) ((Math.random()*100)+1);  // .random 은 double 타입으로 반환하므로 (int) 가 필요
            int rm2 = (int) ((Math.random()*100)+1);  // .random 은 double 타입으로 반환하므로 (int) 가 필요
            int operator = (int) (Math.random()*4); // 0 ~ 3
            String charOperator = " ";
            int result = 0;

            switch (operator) {
                case  0:
                result = rm1 + rm2;
                charOperator = "+";
                break;

                case  1:
                result = rm1 - rm2;
                charOperator = "-";
                break;

                case  2:
                result = rm1 * rm2;
                charOperator = "*";
                break;

                case  3:
                result = rm1 / rm2;
                charOperator = "/";
                break;
            }

            System.out.printf("%d   %s   %d   =   ?? >> ",  rm1, charOperator, rm2 );


            int answer = sc.nextInt();

            if (answer == result) {
                System.out.println("정답입니다 !");
                right_cnt ++;
            }
            else if (answer == 0 ) {
                System.out.println("정답횟수 : "+ right_cnt);
                System.out.println("오답횟수 : "+ wrong_cnt);
                
                break;
            
            }

            else {
                System.out.println("틀렸습니다! ");
                wrong_cnt++;


            }
            }
        }
    }


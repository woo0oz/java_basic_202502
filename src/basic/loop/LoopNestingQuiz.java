package basic.loop;

import java.util.Scanner;

public class LoopNestingQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");

        int num = sc.nextInt();
        int cnt =0 ; //소수 카운터

        System.out.print("소수 : ");

        for (int i=2 ; i <= num ; i++ ) {   // 입력값 까지의 모든 수의 소수 판별 대상
            for (int j=1 ; j <= i ; j++)   {  //소수여부  판별
                cnt = 0 ;
                if (i%j==0) {
                    cnt++;
                }
            if (cnt == 2) {
                System.out.print(i + " \n");
                cnt++;
            }


            }
        }

        System.out.println("소수의 갯수 : " + cnt + "개");



        /*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
		  가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

		 ex)
		 입력받은 수 -> 30
		 소수: 2 3 5 7 11 13 17 19 23 29
		 소수의 개수: 10개
		*/



    }


}

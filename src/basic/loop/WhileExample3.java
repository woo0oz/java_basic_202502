package basic.loop;

import java.util.Scanner;

public class WhileExample3 {
    public static void main(String[] args) {
        /*
             # 사용자에게 구구단 단수를 입력받아서
             해당 단수의 구구단을 출력해 보세요.
             ex)

             구구단을 입력하세요: 4
             *** 구구단 4 단 ***
             4 x 1 = 4
             4 x 2 = 8
             4 x 3 = 12
             4 x 4 = 16
             .
             .
             .
             4 x 9 = 36
         */

        // 단 수 : level
        // 9번 반복

        Scanner sc =  new Scanner(System.in);

        System.out.print("단 수를 입력하세요 : ");
        int level = sc.nextInt();
        int i = 1;

        while (i <= 9 ) {
//            System.out.println("%d  X  %d  =  %d \n", level, i , level*i ) ;

//            System.out.println(level + " X  %d = " +(level*i), i )  ;
            System.out.println(level + " X  " + i +" = " +(level*i)) ;
//

            i++;
        }











    }
}

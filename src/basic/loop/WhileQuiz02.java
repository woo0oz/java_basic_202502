package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {
    public static void main(String[] args) {
        /*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		  인지를 판별하시면 됩니다.
		  소수: 약수가 1과 자기 자신만 있는 수.
		 */

        int counter = 0;
        int i = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int num = sc.nextInt();

        while (i <= num ) {
            if (num%i ==0) {
                counter++;
            }
            i++;
        }
        
        if (counter ==2 ){
            System.out.println("소수 입니다");
        } else {
            System.out.println("소수가 아닙니다");
        }
        sc.close();

        System.out.println("=======================");

        int j =2;

        while (num % j != 0) {
            j++;
        }
        System.out.printf("%d 는 %s\n ", num, num ==j ? "소수입니다" : "소수가 아닙니다.");

    }
}

package basic.constate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {
        /*
        90점 이상 A
        80점 이상 B
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요 : ");
//        String score = sc.nextLine();
        int score = sc.nextInt();

        switch (score / 10) {
            case 10:
                if (score > 100) {
                System.out.println("잘못된 점수 입니다");
                break;
                }
                else {}  // else 출력문, 혹은 else 문을  따로 안써도 case 9 로 빠지므로 굳이 출력문 더 안써도 됨
            case 9 :
                System.out.println("당신의 학점은 A입니다");
                break;
            case 8 :
                System.out.println("당신의 학점은 B입니다");
                break;
            case 7 :
                System.out.println("당신의 학점은 C입니다");
                break;
            case 6 :
                System.out.println("당신의 학점은 D입니다");
                break;

            default :
                if (score > 100 || score < 0)  {
                System.out.println("잘못된 점수입니다");
            }
                else {
                System.out.println("당신의 학점은 F입니다");
            }

        }
        sc.close();

    }
}
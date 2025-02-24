package basic.constate;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("성별을 입력하세요 :  (M/F)" );
        String gender = sc.next();

        switch (gender) {
            case "M", "m", "ㅡ" :  // 14 버젼 부터 적용되는 문법
                System.out.println("남성입니다");
                break; // 해당 케이스만 실행하고 switch 문을 종료해라 !

            case "F" : case "f" :case "ㄹ" :case "여" :
                System.out.println("여성입니다");
                break;

            default : // case 를 설정하지 않은 것들
                System.out.println("잘못된 입력입니다.");

        }
        sc.close();

    }

}

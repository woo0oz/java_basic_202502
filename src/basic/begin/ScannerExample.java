package basic.begin;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 새로운 스캐너 객체를 생성 & 입력명령이므로 in
        // Scanner 변수는 scanner 라는 변수 타입이다.
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();// 입력된 문자를 받으라는 명령어

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();// 입력된 문자를 받으라는 명령어

        System.out.printf("제 이름은 %s이고, 나이는 %d세 입니다." , name , age);

        /*
             3. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
             - next(): 공백이 없는 문자열을 입력받습니다.
             - nextLine(): 공백을 포함한 문자를 입력받습니다.
             - next + 기본타입이름(): 해당 타입에 맞는 데이터를 입력받습니다.
             ex)
                nextInt(): 정수 데이터를 입력받습니다.
                nextDouble(): 실수 데이터를 입력받습니다.
        */

        // 4. 스캐너 객체를 반납
        // 객체를 반납 --> Scanner 객체를 메모리에서 해제
        sc.close();
    }
}

package basic.constate;

import java.util.Scanner;

public class IfQuiz01 {
    public static void main(String[] args) {

/*
            키가 140cm 이상, 나이가 8세 이상이어야 탑승할 수 있는
            놀이기구가 있다고 가정하고, 사용자에게 키와 나이를 입력받아서
            놀이기구 탑승 가능 / 불가능 여부를 알려주세요.
            탑승이 불가능 한 경우 불가능한 이유를 말해 주세요.
            ex)
                키가 140 미만이라 탑승이 불가능하다,
                나이가 8세 미만이라 탑승이 불가능 하다 등.
            - 나이가 6세 이상 8세 미만인 경우, 보호자 동반 시 탑승이 가능하다고
            얘기해 주세요.

            놀이기구 탑승 가능 여부와 상관없이 '오늘 하루 즐거운 시간 되세요~!'
            를 출력하세요.
         */
        Scanner sc = new Scanner(System.in);  // 스캐너 준비

//        System.out.print("키를 입력하세요 : ");
//        int height = sc.nextInt();
//
//        System.out.print("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//
//        if (height < 140 ) {
//            System.out.println("키가 140 미만이라 탑승이 불가능합니다");
//
//        }
//        else if (age < 8) {
//            if (age >= 6) {
//                System.out.println("보호자 동반시 탑승 가능합니다");
//            }
//            else {
//                System.out.println("나이가 8세 미만이라 탑승 불가 합니다");
//            }
//        }
//
//        else {
//            System.out.println("탑승 가능합니다!");
//        }
//
//        sc.close();
//
//        System.out.println("오늘 하루 즐거운 되세요!");
//    }
//}
        System.out.print("키를 입력하세요 : ");
        int height = sc.nextInt();

        if (height >= 140) {
            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();

            if (age >= 8) {
                System.out.println("놀이기구 탑승 가능");
            } else if (age >= 6) {
                System.out.println("보호자 동반시 탑승 가능");
            } else {
                System.out.println("나이가 6세 미만이라 탑승 불가");
                
            }
        } else {
            System.out.println("키가 작아서 탑승 불가");
        }
    }
}


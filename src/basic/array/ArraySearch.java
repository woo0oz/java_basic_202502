package basic.array;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        String[] foods = {"피자", "파스타", "치킨", "삼겹살"};

        Scanner sc = new Scanner(System.in);
        System.out.print("찾고 싶은 음식을 입력하세요 : ");
        String name = sc.next();

        boolean flag = false;

        for (int i = 0; i < foods.length; i++) {
            if (name.equals(foods[i])) {  // == 비교는 기본 타입 끼리만 비교 . 즉 문자열 (String) 은 기본 타입이 아니므로 == 비교가 안됨.
                System.out.println("탐색 완료 !");
                System.out.printf("인덱스는 %d번", i);
                flag = true;
                break;  // 값을 찾으면 더 반복할 필요가 없음.
            }
        }
        if (!flag) {
            System.out.println("없는 음식입니다");
        }
    }
}

// SOL2)
//        for (int i =0 ; i < foods.length; i++) {
//            if (name.equals(foods[i])) {  // == 비교는 기본 타입 끼리만 비교 . 즉 문자열 (String) 은 기본 타입이 아니므로 == 비교가 안됨.
//                System.out.println("탐색 완료 !");
//                System.out.printf("인덱스는 %d번", i);
//                break;  // 값을 찾으면 더 반복할 필요가 없음.
//            } else if (i == foods.length-1) {
//                System.out.println("없는 음식입니다");
//            }
//        }
//    }
//}
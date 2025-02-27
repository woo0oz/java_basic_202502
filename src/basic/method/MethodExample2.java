package basic.method;

import java.util.Arrays;

public class MethodExample2 {

    static int calcRangeTotal(int start, int end) {
        int total = 0;
        for (int i=start; i <= end; i++) {
            total += i;
        }
        return total;
    }

    // 매개변수가 필요 없는 경우
    static String selectRandomFood(){
        double rn = Math.random();  // 0.0 ~ 1.0   Math 클래스의 random 매서드임 ! 
        
        if (rn > 0.66) {
            return "치킨";
        } else if (rn > 0.33){
            return "족발";
        } else {
            return "햄버거";
        }
    }

    // 정수 n개를 전달하면 그 정수들의 평균을 리턴하는 메서드

    static double calcAverage(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return (double)total / nums.length;
    }


    // 가변 파라미터를 이용한 매개변수 작성
    // 콤마로 나열되어 들어오는 여러개의 값을 배열로 묶어서 메서드 내부로 전달합니다.
    static double calcAverage2(int... nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return (double)total / nums.length;
    }


    public static void main(String[] args) {

        System.out.println(calcRangeTotal(5,999));
        System.out.println(calcRangeTotal((int)-88,9999));

        System.out.println("오늘 점심 뭐먹지?? : " + selectRandomFood());

        int[] arr = {1,2,3,4,5};
        System.out.println(calcAverage(arr));

        System.out.println(calcAverage2(1,23,4,5,6,6,7,78,8,9,89,999));

    }
}

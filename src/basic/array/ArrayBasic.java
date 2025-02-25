package basic.array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

    // 배열의 특징
    int[] numbers;
    numbers =  new int[5];

        System.out.println(numbers);

        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 3.14;  // 데이터는 3으로 입력됨
        numbers[3] = numbers[0] + 20;
        numbers[4] = 100;

        // 배열의 길이
        System.out.println(numbers.length);

        // 배열의 순회
        for (int i =0 ; i< numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("======================");

        // 배열의 순회 foreach (향상된 for 문) (배열전용 for 문 개념)
        for (int n : numbers) {
            System.out.println(n);
        }

        // 배열 내부를 문자열 형태로 간결하게 출력
        System.out.println(Arrays.toString(numbers));

        // 배열 한번에 만들기
        int[] pointList = new int[] {10,20,30,40};
        System.out.println(Arrays.toString(pointList));


        System.out.println("========================================");

        byte[] bArr = new byte[3];   // 안이 비어있는게 아니라 타입별 기본 값으로 초기값이 저장되어 있음
        double[] dArr = new double[6];
        boolean[] blArr = new boolean[4];
        String[] sArr = new String[5];


        System.out.println(Arrays.toString(bArr));
        System.out.println(Arrays.toString(dArr));
        System.out.println(Arrays.toString(blArr));
        System.out.println(Arrays.toString(sArr));







    }
}



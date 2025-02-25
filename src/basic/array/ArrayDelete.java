package basic.array;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        // 원하는 위치의 값 삭제하기

        int[] numbers = {1,3,5,7,9,11};
        int targetIndex = 2;

        for (int i= targetIndex; i < numbers.length-1 ; i++) {
            numbers[i] = numbers[i+1];
        }
        System.out.println(Arrays.toString(numbers));


        int[] temp = new int[numbers.length-1];

        //배열 내부데이터 복사
        for (int j = 0; j < temp.length ; j++) {
            temp[j] = numbers[j];
        }
        // 주소값 이전
        numbers = temp; temp = null;
        System.out.println(Arrays.toString(numbers));
    }
}
//        numbers[2] = numbers[3]; // 1, 3, 7, 7, 9, 11
//        numbers[3] = numbers[4]; // 1, 3, 7, 9, 9, 11
//        numbers[4] = numbers[5]; // 1, 3, 7, 9, 11, 11
//        numbers[5] = numbers[6]; (x)
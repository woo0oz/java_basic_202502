package basic.array;

import java.awt.font.NumericShaper;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40};
        int newNumber = 50;

        // 1. 기존 사이즈보다 1개큰 새로운 배열을 선언
        int[] temp = new int[numbers.length+1];

        // 2. 기존 데이터를 새로운 배열에 그대로 복사

        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];
        }

        // 3. temp 배열의 끝 인덱스에 넣을 데이터 추가
        temp[temp.length-1] = newNumber;

        // 4. 주소값 이전 (temp는 더 이상 새 배열에 관려하기 않게 하기!)
        numbers = temp;
        temp = null;
        System.out.println(Arrays.toString(numbers));


    }
}

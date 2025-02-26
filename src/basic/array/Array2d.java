package basic.array;

import java.util.Arrays;

public class Array2d {
    public static void main(String[] args) {

        int[][] arr = new int[3][4];

        System.out.println(Arrays.deepToString(arr));

        int[][] score = {
                {79,80,99},  // A학생
                {11,83,3},  // B학생
                {66,3,15},  // C학생
                {88,41,9}   // D학생

        };


        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};

        /*
         1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
         2. 각 과목의 평균을 출력해 보세요.
         3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
         */

        double totalAvg = 0.0; // 학생들의 평균점수 총합

        int idx = 0;
        for (int[] stu : score) {   // 좌항 : int 배열변수  ,   stu :
            int total = 0 ;
            for (int s : stu) {
                total += s;
            }
            double avg = (double)total / (subName.length);
            System.out.printf("%s의 평균 : %.1f점\n" , stuName[idx] , avg);
            idx++;
        }

        System.out.println("==================================");

        for (int i=0 ; i< subName.length ; i++ ) {    // 과목별 반복
            int total = 0;

            for (int j = 0 ; j <  stuName.length ; j++) {  // 학생별 반복
                total += score[j][i];
            }
            double avg = (double)total / (stuName.length);
            System.out.printf("%s의 평균 : %.1f점\n" , subName[i] , avg);
        }

        System.out.println("==================================");


        double classAvg = totalAvg / stuName.length;
        System.out.printf("우리반 평균 : %.1f점 \n", classAvg);




    }
}

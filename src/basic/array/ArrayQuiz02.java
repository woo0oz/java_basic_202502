package basic.array;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayQuiz02 {
    public static void main(String[] args) {
        /*
		 1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.
		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

		 - 추가
		 배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
		 더 이상 지울 친구가 없다면 프로그램 종료.
		 */

        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};


        while (kakao.length != 0 ) {
            System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
            System.out.println("삭제할 친구의 이름을 입력하세요 :  ");
            String deleteFriend = sc.next();

            boolean flag = false;

            for (int i=0 ; i < kakao.length ; i++) {
                if (kakao[i].equals(deleteFriend)) {   // 배열에 존재하는 친구가 입력될 경우
                    flag = true;

                    for (int j = i; j < kakao.length - 1; j++) {
                        kakao[j] = kakao[j + 1];
                    }
                    String[] temp = new String[kakao.length - 1];
                    for (int j = 0; j < temp.length; j++) {
                        temp[j] = kakao[j];
                    }
                    kakao = temp;
                    temp = null;
                }
                else  {
                    System.out.println(deleteFriend+ "은 없는 이름입니다.");
                }
//                else {
//                    String[] temp = new String[kakao.length-1];
//                    for (int j =0 ;j < temp.length; j++){
//                        temp[j] = kakao[j];
//                    }
//                    kakao = temp;
//                    temp = null;
                    }
                }
        System.out.println("더이상 친구가 없어요");
        sc.close();
            }
        }








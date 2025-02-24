package basic.loop;

public class WhileExample2 {
    public static void main(String[] args) {
        // 48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력
        // 8의 배수 : x % 8 == 0
        // 가로로 출력

        int cnt = 48 ; // begin
        int eight = 0 ; // 8의 배수 저장용

        while (cnt <= 150) {
            if (cnt % 8 == 0) {
                eight = cnt;
                System.out.print(eight + " ");
            }
            cnt ++;
        }
        System.out.println("");

        // 1~ 100 까지의 정수 중 4의 배수이면서
        // 8의 배수는 아닌 수를 가로로 출력

        int i = 1;

        while (i<=100){
            if ( (i%4 == 0) && (i%8 !=0) ) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("");

        // 1 ~ 30000 까지의 정수 중 258의 배수의 개수를 출력

        int count = 0 ; // 배수 갯수
        int k = 1;

        while (k <= 30000) {
            if ( k % 258 ==0 ) {
                count++;
            }
            k++;
        }
        System.out.println("258 배수의 갯수는 : " + count);

       System.out.println("");

    // 1000 의 약수의 갯수를 출력하세요
    // 약수 = 나누어 떨어짐

    int t = 1;
    int number = 0;

    while (t<=1000) {
        if (1000 % t == 0) {
            number += 1;
        }
        t++;
    }
    System.out.println("1000의 약수의 갯수는  : " + number);

    }
}


package basic.method;

import jdk.jshell.Snippet;

public class MethodExample3 {
    
    static int[] operateTotal (int n1, int n2) {
        return new int[] {n1+n2 , n1-n2, n1*n2 , n1/n2};
    }

    static int add (int n1, int n2) {
        return n1 + n2;
    }

    static void multi(int n1, int n2){
        int result = n1 * n2 ;
        System.out.printf("%d x %d  = %d\n", n1, n2, result);
    }

    static void divide(int n1, int n2){
        if (n2==0) {
            System.out.println("0으로 나누시면 안돼요!");
            return;  // 메서드 강제종료 (void 이므로 return 뒤에 아무것도 안씀)
        }
        int result = n1/n2;
        System.out.printf("%d  /  %d = %d\n", n1, n2, result);

    }





    public static void main(String[] args) {

        int r1 = add(3,8);
        int r2 = add(10,15);

        int r3 =  add( add(1,3), add(2,4) );


        System.out.println(r3);

        int[]  result = operateTotal(30,6);
        System.out.println(result[0]);

        System.out.println("========================================");

        // int r4 = multi(7,11);  --> 잘못된 표현 (void라 호출 불가)
        multi(7,0);  // 단독 사용 가능






    }










}

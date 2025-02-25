package basic.loop;

public class LoopNesting2 {

    public static void main(String[] args) {

        /*
                 *
                 **
                 ***
                 ****
                 *****
         */
        for (int i = 1 ; i<=5; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
                  *
                 **
                ***
               ****
              *****
         */
        for (int i = 1 ; i<=5; i++) {
            // 별 찍기 전에 공백을 만드를 for 문
            for (int k=4 ; k>=i ; k--) {
                System.out.print(" ");
            }

            for (int j=1 ; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         *****
         ****
         ***
         **
         *
         */
        System.out.println("=========\n");

        for (int i = 1 ; i<=9; i++) {

            for (int j=9 ; j>=i ; j--) {
                System.out.print("*");
            }
            for (int k=1 ; k<=i ; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

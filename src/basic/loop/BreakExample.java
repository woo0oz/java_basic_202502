package basic.loop;

import java.sql.SQLOutput;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;

            System.out.println(i + " ");
        }
        System.out.println("\n반복문 종료!");

        System.out.println("=========================");

        outer: for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j ) break outer;
                System.out.println(i + "-" + j);

            }

        }
    }
}

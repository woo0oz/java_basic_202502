package basic.method;
public class MethodExample1 {

    // 메서드의 선언 !

    static int calcTotal(int end)  { // static {return 타입} {이름}({매개변수타입 매개변수명}
        int total = 0;
        for (int i=1 ; i <= end ; i++) {
            total += i;
        }
        return total;
    }


    public static void main(String[] args) {
        int total = calcTotal(450);
        System.out.println(total);

        System.out.println(calcTotal(50));
        System.out.println(calcTotal(20));

    }




}

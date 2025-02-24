package basic.operator;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 5, b = 5;

        b =+ 3; // b = +3; -> 이건 대입 연산이 아니에요!!! 순서 잘 지키기
        System.out.println(b);

        a += 3; //a = a + 3 -> 기존의 a에 3을 더한 값을 새롭게 대입하겠다.
        System.out.println(a);

        System.out.println("---------------------------");

        a -= 4; //4 -> 기존의 a에 4를 뺀 값을 대입해서 저장하겠다.
        System.out.println(a);

        a *= 6; //24 -> 기존의 a에 6를 곱한 값을 대입해서 저장하겠다.
        System.out.println(a);

        a /= 5; //4 -> 기존의 a를 5로 나누고 그 몫을 대입해서 저장하겠다.
        System.out.println(a);

        a %= 3; //1 -> 기존의 a를 3으로 나누고 그 나머지를 대입해서 저장하겠다.
        System.out.println(a);

        int num1 = 7, num2 = 7;
        int result1 = --num1 + 4; //앞에 붙으면 전위 연산. 선 증감 후 연산
        int result2 = num2-- + 4; //뒤에 붙으면 후위 연산. 선 연산 후 증감

        System.out.println(result1); //10, num1을 먼저 감소시키고 +4를 진행
        System.out.println(result2); //11, +4를 먼저 진행하고 num2를 감소시킴
        System.out.println(num1); //
        System.out.println(num2); //


    }
}

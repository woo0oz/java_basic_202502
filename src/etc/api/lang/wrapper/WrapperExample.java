package etc.api.lang.wrapper;

public class WrapperExample {
    public static void main(String[] args) {

        int a = 100;
        boolean b = false;
        char c = 'A';
        double d = 3.14;

        // boxing : 기본 데이터 타입을 객체 형태로 포장한다 !
//        Integer v1 = new Integer(a);  // --> (x) s deprecated

        // auto boxing : 기본타입을 자동으로 객체형으로 변환
        Integer v1 = a ; // 객체 타입으로 포장 완료
        Boolean v2 = b ;
        Character v3 = c;
        Double v4 = d;

        System.out.println("v4 = " + v4);


        // unboxing : 객체 타입으로 포장된 값을 기본 데이터 타입으로 풀어내는 과정
        // int i = v1.intValue(); // 옛날 문법 (deprecated)
                                    // 예전에는 메서드를 불러서 리턴 받은 값을 넣어줬음

        int i = v1;
        double d2 = v4;






    }
}

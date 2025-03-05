package etc.api.lang.string;

public class StrTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//
//        String str = "a";
//        for (int i = 0; i < 500000; i++) {
//            str += "a";
//        }


        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 500000; i++) {
            sb.append("a");
        }


        long end = System.currentTimeMillis();

        System.out.println("실행 결과: " + (end - start) * 0.001 + "초");

        double pi = 3.141592;
        System.out.println(Math.round(pi));  // return 타입이 long -> 무조건 소수점 1쨰 자리에서 반올림해서 정수를 return 함


    }


}

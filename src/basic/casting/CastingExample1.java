package basic.casting;

public class CastingExample1 {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;  // 서로 다른 형일떄, 더 큰 자료형 쪽이 무엇인지 비교
                    // byte 타입을 int 타입으로 형변환하여 저장(upcasting, promotion)
//        System.out.println(i);

        char c = '가';
        int j = c;   // char가 int로 변환
//        System.out.println(j);

        int k = 500;
        double d = k;

        System.out.println("d = " + d);
    }
}

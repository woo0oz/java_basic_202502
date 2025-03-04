package etc.exception.throw_;

public class ThrowExample {

    static int calcTotal(int end) throws Exception {    // 호출부로 예외처리하기
        if (end <= 0 ) {
            System.out.println("잘못된 매개값!");
            // return; : void 메서드에서만 쓸 수 있다.
            throw new Exception();

        }

        int total = 0;
        for (int i = 0; i <= end ; i++) {
            total += i;
        }

        return total;
    }

    public static void main(String[] args) {
        try {
            int result1 = calcTotal(100);
            int result2 = calcTotal(-120);

        } catch (Exception e) {
            System.out.println("매개값에 이상이 있어서 리턴이 되지 못함 !");
            e.printStackTrace();
        }
    }
}

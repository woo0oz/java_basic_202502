package oop.fieldlocal;

public class FieldAndLocal {

    // 필드는 값을 초기화 해주지 않아도 객체 생성시 각 타입의 기본값으로 자동 초기화 됨
    int aaa;  // -> 필드임

    void foo(int ccc) {  // 매개변수도 지역변수의 일종

        // 지역변수(local variable)   , 필드가 아님 !!
        // 해당 지역에서만 유효한 변수. 해당 블록이 끝나면 메모리에서 소멸.
        int bbb =20 ;  // 초기화 없이는 사용 불가

        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
    }

    void foo2() {
        System.out.println("aaa = " + aaa);


    }


}

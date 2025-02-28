package oop.encap.bad;

public class MyBirth {
    // 보통 필드 , 생성자 , 메서드 순서로  선언함

    //필드
    int year  ;
    int month ;
    int day ;

    // 메서드
    void birthInfo(){
        System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n"
                , this.year, this.month, this.day);
    }

    //


}

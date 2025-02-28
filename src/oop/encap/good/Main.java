package oop.encap.good;

import oop.encap.good.MyBirth;

public class Main {
    public static void main(String[] args) {
        MyBirth my = new MyBirth();
        // my.year = 2158148;  // year라는 변수는 private access 이므로 호출 불가 !
        // my.day = 13; // 사용 불가!

        my.SetYear(1992);

        System.out.printf("내 생일은 %d년 입니다\n" , my.getYear());

        my.setMonth(6);

        my.setDay(18);

        System.out.printf("내 생일은 %d년 %d월 %d일 입니다\n"
                , my.getYear(), my.getMonth(),my.getDay());

    }
}

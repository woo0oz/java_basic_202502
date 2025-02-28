package oop.encap.bad;

public class Main {
    public static void main(String[] args) {

        MyBirth my = new MyBirth();  // 객체 생성

        my.year = 1992;
        my.month = 10;
        my.day = 13;

        my.birthInfo();

    }
}

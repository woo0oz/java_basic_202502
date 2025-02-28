package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {
    void test() {  // 메서드 선언
        A a1 = new A(50);    // public
//        A a2 = new A(3.14);  // default
//        A a3 = new A(false);    // private

        a1.f1 = 20;
//        a1.f2 = 30; // default
//        a1.f3 = 40; // private

        a1.m1();
//        a1.m2();
//        a1.m3();

    }
}
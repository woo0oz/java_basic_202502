package oop.static_.exercise;

public class Main {
    public static void main(String[] args) {

        MyClass m1 = new MyClass();

        m1.a += 5;
        m1.b += 5;

        System.out.println("인스턴스 변수 m1.a: " + m1.a); //5
        System.out.println("정적 변수 m1.b: " + m1.b); //5


        MyClass m2 = new MyClass();

        m2.a += 7;
        m2.b += 7;

        System.out.println("인스턴스 변수 m1.a: " + m2.a); //
        System.out.println("정적 변수 m1.b: " + m2.b); //


    }

}

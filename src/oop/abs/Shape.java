package oop.abs;

import javax.sound.midi.Soundbank;

public abstract class Shape {
    /*
    도형 클래스를 생성
    다양한 도형들의 부모 클래스가 될 것
     */

    // 필드
    String color;

    //생성자
    public Shape(String color) {
        this.color = color;
    }

    // 메서드
    public abstract double calculateArea() ;
    // 도형들마다 공식이 다르므로 당장 정의가 불가
    // 자식 쪽에서 오버라이딩이 강제된다.

    public abstract double calculatePerimeter() ;

    public void displayColor(){
        System.out.println("이 도형의 색상 : " + color);
    }

    // 오버라이딩 금지
    public final void displayInfo() {
        System.out.println("\n===== 도형 정보 =====");
        displayColor();
        System.out.println("도형 종류: " + this.getClass().getSimpleName());
        System.out.println("면적: " + calculateArea());
        System.out.println("둘레: " + calculatePerimeter());
        System.out.println("====================");
    }


    }


package oop.inter;

// 인터페이스 : 여러 "종류"의 게임 컨트롤러가 반드시 구현해야 하는 메서드를 정의
//

public interface  JoystickController, Vibration {
    int NUM = 5;
    // 인터페이스에서는 상수 로 인식 (static final)
    // public static final int num = 5 와 동일하다.
    // 상수는 대문자 로 표기

    //인터페이스는 생성자를 가질 수 없음 (객체화 될 수 없는 개념)

    // 추상 메서드
    // abstract 를 굳이 안붙여도 컴파일 과정에서 붙여줌
    void moveCharacter(String direction) ; // 이런 메소드가 있을거야 ~ 라는 틀만 제공
    void action();
    void pause();


}

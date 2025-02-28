package oop.inter;

// 인터페이스를 구현하는 구현체 클래스는 반드시 모든 추상 메서드를 재정의 해야 합니다.
// 인터페이스는 동시에 다중 구현도 가능


public class KeyboardController implements KeyboardController, Vibration {


    @Override
    public void moveCharacter(String direction) {
        System.out.println("키보드 " + direction + "키를 눌러 행동 수행");

    }

    @Override
    public void action() {
        System.out.println("키보드 스페이스바를 눌러 행동 수행");
    }

    @Override
    public void pause() {
        System.out.println("");
    } // 구현체


    @Override
    public void vibrate(int intensity) {

    }

    @Override
    public void offVibrate() {

    }
}

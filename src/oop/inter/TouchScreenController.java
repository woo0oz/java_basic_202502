package oop.inter;

// 인터페이스를 구현하는 구현체 클래스는 반드시 모든 추상 메서드를 재정의 해야 합니다.
public class TouchScreenController implements GameController {

    @Override
    public void moveCharacter(String direction) {
        System.out.println("화면을 " + direction + "방향으로 스와이프해서 캐릭터 이동");
    }

    @Override
    public void action() {
        System.out.println("화면을 탭 해서 행동 수행");
    }

    @Override
    public void pause() {
        System.out.println("화면 상단 일시정지 버튼을 눌러 게임 일시 정지");
    }
}

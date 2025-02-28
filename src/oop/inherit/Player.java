package oop.inherit;

public class Player {
    /*
    # 부모 클래스, 상위 클래스 (Parent, super class)

    - 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부릅니다.
    - 상속을 사용하면 데이터를 물려받는 클래스에게 부모 클래스의
     멤버변수(필드)와 메서드가 상속됩니다. 단, 생성자는 상속되지 않습니다.
*/


    // 필드
    String nickName;
    int level;
    int hp;

    // 생성자
    Player() {
        System.out.println("Player 의 기본 생성자 호출!");
        this.level = 1;
        this.hp = 50;
    }

    Player(String nickName) {
        this();
        System.out.println("Player의 2번 생성자 호출!");
        this.nickName = nickName;
    }


    // 메서드





}

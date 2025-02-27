package oop.this_;

public class Player {
    Player() {
        System.out.println("플레이어의 기본 생성자가 호출되었다 ! ");
        level = 1;
        hp = 50;
    }
     Player(String nickName) {
            System.out.println("플레이어의 2번 생성자가 호출되었다 ! ");
            this.nickName = nickName;

            System.out.println("this 주소값 : " +  this);
            // 좌 : player class 의 필드 nickName 을 의미
                    // but this 문 없이는 매개값 = 매개값이 되어 버림
            // 우 : 매개값을 받은 nickName 을 의미


            level = 1;
            hp = 50;
        }

    // 필드
    String nickName;
    int level ;
    int hp ;


//    @Override
//    public String toString() {
//        return "Player{" +
//                "nickName='" + nickName + '\'' +
//                ", level=" + level +
//                ", hp=" + hp +
//                '}';
//    }
}

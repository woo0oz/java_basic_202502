package oop.this_;

public class Player {
    Player() {
        System.out.println("플레이어의 기본 생성자가 호출되었다 ! ");
        level = 1;
        hp = 50;
    }
    Player(String nickName) {
            this();  // 다른 생성자를 부르는 키워드 (인자가 필요없는)

            System.out.println("플레이어의 2번 생성자가 호출되었다 ! ");
            this.nickName = nickName;

            System.out.println("this 주소값 : " +  this);
            // 좌 : player class 의 필드 nickName 을 의미
                    // but this 문 없이는 매개값 = 매개값이 되어 버림
            // 우 : 매개값을 받은 nickName 을 의미

    }

    Player(String nickName, int hp){
//        this(); // 기본생성자 실행
        this(nickName) ; // nickname 을 인자로 갖는 생성자를 실행
        System.out.println("3번 생성자 호출!");
        this.hp = hp;
    }


    // 필드
    String nickName;
    int level ;
    int hp ;


    // 일반 메서드

    void attack(Player target){

        if (target == this) {
            System.out.println("타겟이 잘못되었습니다");
            return;
        }

        System.out.printf("%s이(가)  %s을(를) 공격합니다!\n"
                , this.nickName, target.nickName );  // 공격을 하는 그 객체의 nickName

        // 맞는 Player의 체력을 10 감소시키자.
        target.hp -= 10 ;

        // 때리는 Player의 체력을 3 감소시키자.
        this.hp -= 3;  // attack 이란 메소드를 실행하는 바로 그 객체 !!!

        System.out.printf("%s님의 남은 체력 : %d\n", this.nickName,   this.hp   ) ;
        System.out.printf("%s님의 남은 체력 : %d\n", target.nickName, target.hp ) ;


    }




    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                '}';
    }
}

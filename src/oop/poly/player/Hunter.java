package oop.poly.player;

import oop.inherit.Player;

import java.lang.annotation.Target;

public class Hunter extends Player {
    public Hunter(String nickName, String pet){
        super(nickName);
        this.pet = pet;
    }

public void magicArrow(Player target) { // Player의 자식이기만 하면 magicArrow전달 되어야 한다
    // 직업별로 다른 데미지를 준다 (고정값)
    System.out.println("%d님이 매직애로우 시전!!\n", this.nickName, target.nickName);

    int damage;
    String job;

    if (target instanceof Warrior) {
        damage = 10;
        job = "전사";
    } else if (target instanceof Mage ) {
        damage = 20;
        job = "마법사";
    } else (target instanceof Hunter) {
        damage = 15;
        job = "사냥꾼";
    }

    target.hp -= damage;
    System.out.printf("%s님($s)이 %d의 피해를 입었습니다.\n",
            target.nickName, job, damage);
    System.out.printf("%s님의 남은 체력 : %d\n", target.nickName, target.hp);
    System.out.println("========================================");


}

}

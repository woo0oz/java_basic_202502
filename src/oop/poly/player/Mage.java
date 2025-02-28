package oop.poly.player;

import oop.inherit.Player;

public class Mage {

    public void blizzard(Player...targets){
        System.out.println("%d님이 눈보라 시전!!\n", this.nickName);
        this.mana -= 30;
        System.out.printf("30의 마나가 소모됩니다. 남은 정신력 : %d\n", this.mana);
        System.out.println("=====================");

        for (Player p : targets) {
            int damage = (int) (Math.random()*6+10);
            p.hp -= damage;
            System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d)\n"
                    , p.nickName,damage, p.hp   );

        }

    }

}

package oop.this_;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

//        Player p1 = new Player();
        Player p1 = new Player("플레이어1");
        System.out.println("p1 주소값 : " +  p1);


        System.out.println(p1.toString());

        System.out.println("====================================");

        Player p2 = new Player("플레이어2");
        System.out.println("p2 주소값 : " +  p2);




    }
}

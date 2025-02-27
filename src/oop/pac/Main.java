package oop.pac;

// 다른 패키지에 존재하는 클래스의 객체를 생성할 떄는 반드시 import 선언이 있어야 합니다.
// 같은 패키지면  import 가 필요 없다 !

//import oop.pac.fruits.Apple;
//import oop.pac.fruits.Banana;
//import oop.pac.fruits.Melon;

import oop.pac.fruits.*;

public class Main {
    public static void main(String[] args) {

       Apple apple   = new Apple();
       Banana banana = new Banana();
       Melon melon   =  new Melon();


    }
}

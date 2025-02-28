package oop.inter;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 인터페이스와 구현체 간에도 다형성 발생이 가능하다.
        GameController keyboard = new KeyboardController();
        GameController joystick = new JoystickController();
        GameController touchScreen = new TouchScreenController();


        Scanner scanner = new Scanner(System.in);
        System.out.println("게임을 플레이할 도구를 선택하세요.");
        System.out.println("1. 키보드 | 2. 조이스틱 | 3. 터치스크린");
        System.out.println(">");
        int menu = scanner.nextInt();

        if (menu == 1) {
            gc = new KeyboardController();
        } else if (menu==2) {
            gc = new JoystickController();
        } else if (menu==3) {
            gc = new TouchScreenController();
        }

        gc.moveCharacter("위");
        gc.action();
        gc.pause();


    }
}

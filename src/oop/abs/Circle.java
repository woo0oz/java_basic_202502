package oop.abs;

/*
     # 추상 클래스, 추상 메서드
     1. 추상 클래스의 메서드에 abstract를 붙이면 해당 메서드는
      실체가 없는 추상 메서드가 되며, 이 메서드는 상속을 통해 자식 클래스에서
      무조건 오버라이딩을 하도록 강요됩니다.
     2. 추상메서드는 실체가 존재하지 않는 틀 역할을 하기 때문에
      메서드의 바디 ({})부분이 없고, 세미콜론으로 메서드 선언을 마감합니다.
     3. 일반 클래스에서는 추상 메서드를 선언할 수 없습니다. 추상 메서드가
      하나라도 존재하는 경우에는 반드시 해당 클래스를 추상 클래스로 선언해야 합니다.
     4. 추상 클래스에 추상 메서드만을 선언할 필요는 없습니다.
      일반 멤버변수 및 메서드도 얼마든지 선언이 가능합니다.
     */

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        // 부모의 생성자가 특정 매개값을 받는 생성자 밖에 없다면
        // 자식 생성자에서도 반드시 특정 매개값을 전달하는 생성자를 호출해야 합니다.

        // ( 부모의 color 값 사용)
        // 자식이 상속될 때는 부모도 반드시 실체화가 되어야 한다 !
        // super 를 부르면서 반드시 color 를 입력해야 함 !
        this.radius = radius; //
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}

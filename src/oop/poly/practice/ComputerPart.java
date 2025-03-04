package oop.poly.practice;

public class ComputerPart {

    // protected : 패키지가 달라지면 접근 허용하지 않지만, 자식에게는 허용한다.

    protected String partName;  // 자식이면 패키지 달라져도 사용가능!
    protected int partPrice;

    public ComputerPart(String partName, int partPrice) {
        this.partName = partName;
        this.partPrice = partPrice;
    }

    public void describePart(){
        System.out.printf("Part :  " + partName + ", Price : " + partPrice);
    }



}

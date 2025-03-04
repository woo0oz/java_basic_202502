package oop.poly.practice;

public class Computer {
    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[0]; // 객체가 생성될 때  크기 0 짜리 배열도 같이 세팅
    }

    public void addPart(ComputerPart part) {
        ComputerPart[] temp = new ComputerPart[parts.length+1] ;
        for (int i = 0; i < parts.length ; i++) {
            temp[i] = parts[i];
        }
        temp[temp.length-1] = part;
        parts =temp ;
    }

    public void showParts() {
        for (ComputerPart part : parts) {
            part.describePart();
        }
    }
}

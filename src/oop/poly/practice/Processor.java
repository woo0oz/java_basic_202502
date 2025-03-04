package oop.poly.practice;

public class Processor extends ComputerPart{

    public Processor(String partName, int partPrice) {
        super(partName, partPrice);
    }

    //단축키 : alt + insert 사용 !
    @Override
    public void describePart() {
        System.out.printf("Processor :  " + partName + ", Price : " + partPrice);
    }
}

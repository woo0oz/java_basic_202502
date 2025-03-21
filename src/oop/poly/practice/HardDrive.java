package oop.poly.practice;

public class HardDrive extends ComputerPart {
    public HardDrive(String partName, int partPrice) {
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.printf("Hard Drive :  " + partName + ", Price : " + partPrice);
    }
}

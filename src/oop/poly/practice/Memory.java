package oop.poly.practice;

public class Memory extends ComputerPart{
    public Memory(String partName, int partPrice) {
        super(partName, partPrice);

    }

    @Override
    public void describePart() {
        System.out.printf("Memory :  " + partName + ", Price : " + partPrice);
    }
}

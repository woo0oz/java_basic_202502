package oop.encap.practice;

public class Car {
    private String brand;
    private String model;
    private int year;

    //생성자 따로 선언 X


    // alt + insert
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2025) {
            System.out.println("유효하지 않은 연식입니다.");
            return;
        }
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

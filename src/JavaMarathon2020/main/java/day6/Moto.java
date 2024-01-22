package day6;

public class Moto {
    private int year;
    private String model;
    private String color;

    public Moto(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        return  this.year - year;
    }
}


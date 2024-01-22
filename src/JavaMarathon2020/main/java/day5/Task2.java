package day5;

public class Task2 {
    public static void main(String[] args) {
        Moto java = new Moto("Java", "White", 2019);

        System.out.println("Model " + java.getModel());
        System.out.println("Color " + java.getColor());
        System.out.println("Year " + java.getYear());

    }
}

class Moto {
    private int year;
    private String model;
    private String color;

    Moto(String model, String color, int year) {
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
}


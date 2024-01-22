package day5;

public class Task1 {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setModel("Lada");
        lada.setColor("Black");
        lada.setYear(2019);

        System.out.println("Model " + lada.getModel());
        System.out.println("Color " + lada.getColor());
        System.out.println("Year " + lada.getYear());

    }
}

class Car {
    private int year;
    private String model;
    private String color;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
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


package day6;

public class Task1 {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setModel("Lada");
        lada.setColor("Black");
        lada.setYear(2019);

        Moto java = new Moto("Java", "White", 2020);

        lada.info();
        java.info();

        System.out.println(lada.yearDifference(2015));
        System.out.println(java.yearDifference(2015));

    }
}

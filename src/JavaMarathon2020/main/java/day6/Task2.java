package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane concord = new Airplane("Concord", 1955, 158, 3000);
        concord.info();
        concord.setYear(1958);
        concord.setLength(180);
        concord.info();
        concord.fillUp(100);
        concord.fillUp(300);
        concord.info();
    }
}

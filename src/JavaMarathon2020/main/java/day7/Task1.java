package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane concord = new Airplane("Concord", 1955, 158, 3000);
        Airplane aerobus = new Airplane("Aerobus", 1960, 170, 2000);
        Airplane.compareAirplanes(concord, aerobus);
        concord.setLength(200);
        Airplane.compareAirplanes(concord, aerobus);
    }
}
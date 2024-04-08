package day7;

public class Task2 {
    public static void main(String[] args) {
        Player p1 = new Player(90);
        Player p2 = new Player(91);
        Player p3 = new Player(92);
        Player p4 = new Player(93);
        Player p5 = new Player(94);
        Player p6 = new Player(95);
        Player.info();

        Player p7 = new Player(96);
        Player p8 = new Player(97);
        Player.info();

        while (p6.getStamina() != 0){
            p6.run();
        }
        p6.run();
        Player.info();

        Player p9 = new Player(98);
        Player.info();
    }
}

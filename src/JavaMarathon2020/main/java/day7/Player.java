package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
    }

    public int getStamina() {
        return  stamina;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        if (stamina > MIN_STAMINA) {
            stamina = stamina - 1;
        }
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if(countPlayers < 6) {
            System.out.println("Команды неполные. на оле есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

}


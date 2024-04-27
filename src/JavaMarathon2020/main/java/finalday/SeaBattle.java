package finalday;

import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        System.out.print("Введите имя первого игрока: ");
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.nextLine();
        GameField gameField1 = new GameField(player1);
        System.out.print("\033[H\033[J");
        gameField1.printField(player1);
    }
}

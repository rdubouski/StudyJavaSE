package finalday;

import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        System.out.print("Введите имя первого игрока: ");
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.nextLine();
        GameField gameField1 = new GameField(player1);
        System.out.print("\033[H\033[J");

        System.out.print("Введите имя второго игрока: ");
        scanner = new Scanner(System.in);
        String player2 = scanner.nextLine();
        GameField gameField2 = new GameField(player2);
        System.out.print("\033[H\033[J");

        gameField1.printField(player1);
        System.out.println("Начнем расставлять корабли на поле " + player1 + ". Другой игрок не смотри!");
        gameField1.place4Ship();
        gameField1.printField(player1);
    }
}

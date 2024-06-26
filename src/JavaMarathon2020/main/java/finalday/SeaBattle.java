package finalday;

import java.util.Random;
import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        System.out.print("Введите имя первого игрока: ");
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.nextLine();
        GameField gameField1 = new GameField(player1);
        gameField1.printMyField();
        System.out.println("Начнем расставлять корабли на поле " + player1 + ". Другой игрок не смотри!");
        gameField1.place4Ship();
        gameField1.printMyField();
        gameField1.place3Ship();
        gameField1.printMyField();
        gameField1.place3Ship();
        gameField1.printMyField();
        gameField1.place2Ship();
        gameField1.printMyField();
        gameField1.place2Ship();
        gameField1.printMyField();
        gameField1.place2Ship();
        gameField1.printMyField();
        gameField1.place1Ship();
        gameField1.printMyField();
        gameField1.place1Ship();
        gameField1.printMyField();
        gameField1.place1Ship();
        gameField1.printMyField();
        gameField1.place1Ship();
        gameField1.printMyField();

        System.out.print("\033[H\033[J");
        System.out.print("Введите имя второго игрока: ");
        scanner = new Scanner(System.in);
        String player2 = scanner.nextLine();
        GameField gameField2 = new GameField(player2);
        gameField2.printMyField();
        System.out.println("Начнем расставлять корабли на поле " + player2 + ". Другой игрок не смотри!");
        gameField2.place4Ship();
        gameField2.printMyField();
        gameField2.place3Ship();
        gameField2.printMyField();
        gameField2.place3Ship();
        gameField2.printMyField();
        gameField2.place2Ship();
        gameField2.printMyField();
        gameField2.place2Ship();
        gameField2.printMyField();
        gameField2.place2Ship();
        gameField2.printMyField();
        gameField2.place1Ship();
        gameField2.printMyField();
        gameField2.place1Ship();
        gameField2.printMyField();
        gameField2.place1Ship();
        gameField2.printMyField();
        gameField2.place1Ship();
        gameField2.printMyField();
        System.out.print("\033[H\033[J");


        Random random = new Random();
        int ap = random.nextInt(2);
        if (ap == 0) {
            GameField.battle(gameField1, gameField2);
        } else {
            GameField.battle(gameField2, gameField1);
        }
    }
}

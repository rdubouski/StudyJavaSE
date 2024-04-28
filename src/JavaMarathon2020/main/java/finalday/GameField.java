package finalday;

import java.util.Scanner;

public class GameField {

    private String name;
    private String[][] myfield;
    private String[][] enemyfield;
    private static final String[][] DEFAULTFIELDMY = {
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
    };

    private static final String[][] DEFAULTFIELDENEMY = {
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
    };

    public GameField(String name) {
        this.name = name;
        this.myfield = DEFAULTFIELDMY;
        this.enemyfield = DEFAULTFIELDENEMY;
    }

    public void printField(String name) {
        System.out.println("Поле игрока " + name);
        System.out.println("  0123456789");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(this.myfield[i][j]);
            }
            System.out.println();
        }

        System.out.println("Поле врага");
        System.out.println("  0123456789");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(this.enemyfield[i][j]);
            }
            System.out.println();
        }
    }

    public void place4Ship() {
        boolean check = false;
        Scanner scanner;
        String line;
        String[] coordinateAll;
        int[][] coordinates = new int[4][2];

        while (!check) {
            int i = 0, j = 0;
            System.out.println("Введи координаты четырехпалубного корабля (от 0 до 9) (формат: x,y;x,y;x,y;x,y)");
            scanner = new Scanner(System.in);
            line = scanner.nextLine();
            if (line.length() != 15) {
                System.out.println("Неверное количество координат!");
                continue;
            }
            coordinateAll = line.split(";");
            for (String string : coordinateAll) {
                coordinates[i][j] = Integer.parseInt(String.valueOf(string.charAt(0)));
                coordinates[i][j + 1] = Integer.parseInt(String.valueOf(string.charAt(2)));
                i++;
            }

            for (i = 0; i < 4; i++) {
                this.printCoordinate(coordinates[i][0], coordinates[i][1], "o");
            }

            check = true;
        }
    }

    public void printCoordinate(int x, int y, String value) {
        this.myfield[x][y] = value;
    }
}

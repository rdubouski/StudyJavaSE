package finalday;

import java.util.Scanner;

public class GameField {

    private String name;
    private String[][] myfield;
    private String[][] enemyfield;
    private String[][] DEFAULTFIELDMY = {
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

    private String[][] DEFAULTFIELDENEMY = {
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
            boolean checkCorrect = true;
            System.out.println("Введи координаты четырехпалубного корабля (от 0 до 9) (формат: x,y;x,y;x,y;x,y)");
            scanner = new Scanner(System.in);
            line = scanner.nextLine();
            // Проверка на количество координат #3 q1
            if (line.length() != 15) {
                System.out.println("Неверное количество координат!");
                continue;
            }
            coordinateAll = line.split(";");
            for (String string : coordinateAll) {
                // Проверка на корректность координат #3 q2
                if ((!Character.isDigit(string.charAt(0))) || (!Character.isDigit(string.charAt(2)))) {
                    System.out.println("Неверные координаты!");
                    checkCorrect = false;
                }
                if (checkCorrect) {
                    coordinates[i][j] = Integer.parseInt(String.valueOf(string.charAt(0)));
                    coordinates[i][j + 1] = Integer.parseInt(String.valueOf(string.charAt(2)));
                    i++;
                }
            }
            // Проверка на валидность координат #3 q3
            if (checkCorrect) {
                if (coordinates[0][0] == coordinates[1][0] && coordinates[0][0] == coordinates[2][0] && coordinates[0][0] == coordinates[3][0]) {
                    if (coordinates[0][1] == coordinates[1][1] - 1 && coordinates[0][1] == coordinates[2][1] - 2 && coordinates[0][1] == coordinates[3][1] - 3) {
                        checkCorrect = true;
                    } else {
                        System.out.println("Не валидные координаты! Координаты должны быть последовательные!");
                        checkCorrect = false;
                    }
                } else if (coordinates[0][1] == coordinates[1][1] && coordinates[0][1] == coordinates[2][1] && coordinates[0][1] == coordinates[3][1]) {
                    if (coordinates[0][0] == coordinates[1][0] - 1 && coordinates[0][0] == coordinates[2][0] - 2 && coordinates[0][0] == coordinates[3][0] - 3) {
                        checkCorrect = true;
                    } else {
                        System.out.println("Не валидные координаты! Координаты должны быть последовательные!");
                        checkCorrect = false;
                    }
                }
            }
            if (checkCorrect) {
                for (i = 0; i < 4; i++) {
                    this.printCoordinate(coordinates[i][0], coordinates[i][1], "o");
                }
                for (i = 0; i < 4; i++) {
                    this.printHalo(coordinates[i][0], coordinates[i][1]);
                }
                check = true;
            }
        }
    }

    public void place3Ship() {
        boolean check = false;
        Scanner scanner;
        String line;
        String[] coordinateAll;
        int[][] coordinates = new int[3][2];

        while (!check) {
            int i = 0, j = 0;
            boolean checkCorrect = true;
            System.out.println("Введи координаты треххпалубного корабля (от 0 до 9) (формат: x,y;x,y;x,y)");
            scanner = new Scanner(System.in);
            line = scanner.nextLine();
            // Проверка на количество координат #3 q1
            if (line.length() != 11) {
                System.out.println("Неверное количество координат!");
                continue;
            }
            coordinateAll = line.split(";");
            for (String string : coordinateAll) {
                // Проверка на корректность координат #3 q2
                if ((!Character.isDigit(string.charAt(0))) || (!Character.isDigit(string.charAt(2)))) {
                    System.out.println("Неверные координаты!");
                    checkCorrect = false;
                }
                if (checkCorrect) {
                    coordinates[i][j] = Integer.parseInt(String.valueOf(string.charAt(0)));
                    coordinates[i][j + 1] = Integer.parseInt(String.valueOf(string.charAt(2)));
                    i++;
                }
            }
            // Проверка на валидность координат #3 q3
            if (checkCorrect) {
                if (coordinates[0][0] == coordinates[1][0] && coordinates[0][0] == coordinates[2][0]) {
                    if (coordinates[0][1] == coordinates[1][1] - 1 && coordinates[0][1] == coordinates[2][1] - 2) {
                        checkCorrect = true;
                    } else {
                        System.out.println("Не валидные координаты! Координаты должны быть последовательные!");
                        checkCorrect = false;
                    }
                } else if (coordinates[0][1] == coordinates[1][1] && coordinates[0][1] == coordinates[2][1]) {
                    if (coordinates[0][0] == coordinates[1][0] - 1 && coordinates[0][0] == coordinates[2][0] - 2) {
                        checkCorrect = true;
                    } else {
                        System.out.println("Не валидные координаты! Координаты должны быть последовательные!");
                        checkCorrect = false;
                    }
                }
            }
            // Проверка на свободность координат #3 q5
            if (checkCorrect) {
                for (i = 0; i < 3; i++) {
                    if (!this.myfield[coordinates[i][0]][coordinates[i][1]].equals("o") && !this.myfield[coordinates[i][0]][coordinates[i][1]].equals("=")) {
                        checkCorrect = true;
                    } else {
                        System.out.println("Введенные координаты заняты!");
                        checkCorrect = false;
                        i = 3;
                    }
                }
            }
            if (checkCorrect) {
                for (i = 0; i < 3; i++) {
                    this.printCoordinate(coordinates[i][0], coordinates[i][1], "o");
                }
                for (i = 0; i < 3; i++) {
                    this.printHalo(coordinates[i][0], coordinates[i][1]);
                }
                check = true;
            }
        }
    }

    public void place2Ship() {
        boolean check = false;
        Scanner scanner;
        String line;
        String[] coordinateAll;
        int[][] coordinates = new int[2][2];

        while (!check) {
            int i = 0, j = 0;
            boolean checkCorrect = true;
            System.out.println("Введи координаты двухпалубного корабля (от 0 до 9) (формат: x,y;x,y)");
            scanner = new Scanner(System.in);
            line = scanner.nextLine();
            // Проверка на количество координат #3 q1
            if (line.length() != 7) {
                System.out.println("Неверное количество координат!");
                continue;
            }
            coordinateAll = line.split(";");
            for (String string : coordinateAll) {
                // Проверка на корректность координат #3 q2
                if ((!Character.isDigit(string.charAt(0))) || (!Character.isDigit(string.charAt(2)))) {
                    System.out.println("Неверные координаты!");
                    checkCorrect = false;
                }
                if (checkCorrect) {
                    coordinates[i][j] = Integer.parseInt(String.valueOf(string.charAt(0)));
                    coordinates[i][j + 1] = Integer.parseInt(String.valueOf(string.charAt(2)));
                    i++;
                }
            }
            // Проверка на валидность координат #3 q3
            if (checkCorrect) {
                if (coordinates[0][0] == coordinates[1][0]) {
                    if (coordinates[0][1] == coordinates[1][1] - 1) {
                        checkCorrect = true;
                    } else {
                        System.out.println("Не валидные координаты! Координаты должны быть последовательные!");
                        checkCorrect = false;
                    }
                } else if (coordinates[0][1] == coordinates[1][1]) {
                    if (coordinates[0][0] == coordinates[1][0] - 1) {
                        checkCorrect = true;
                    } else {
                        System.out.println("Не валидные координаты! Координаты должны быть последовательные!");
                        checkCorrect = false;
                    }
                }
            }
            // Проверка на свободность координат #3 q5
            if (checkCorrect) {
                for (i = 0; i < 2; i++) {
                    if (!this.myfield[coordinates[i][0]][coordinates[i][1]].equals("o") && !this.myfield[coordinates[i][0]][coordinates[i][1]].equals("=")) {
                        checkCorrect = true;
                    } else {
                        System.out.println("Введенные координаты заняты!");
                        checkCorrect = false;
                        i = 2;
                    }
                }
            }
            if (checkCorrect) {
                for (i = 0; i < 2; i++) {
                    this.printCoordinate(coordinates[i][0], coordinates[i][1], "o");
                }
                for (i = 0; i < 2; i++) {
                    this.printHalo(coordinates[i][0], coordinates[i][1]);
                }
                check = true;
            }
        }
    }

    public void place1Ship() {
        boolean check = false;
        Scanner scanner;
        String line;
        String[] coordinateAll;
        int[][] coordinates = new int[1][2];

        while (!check) {
            int i = 0, j = 0;
            boolean checkCorrect = true;
            System.out.println("Введи координаты однопалубного корабля (от 0 до 9) (формат: x,y)");
            scanner = new Scanner(System.in);
            line = scanner.nextLine();
            // Проверка на количество координат #3 q1
            if (line.length() != 3) {
                System.out.println("Неверное количество координат!");
                continue;
            }
            coordinateAll = line.split(";");
            for (String string : coordinateAll) {
                // Проверка на корректность координат #3 q2
                if ((!Character.isDigit(string.charAt(0))) || (!Character.isDigit(string.charAt(2)))) {
                    System.out.println("Неверные координаты!");
                    checkCorrect = false;
                }
                if (checkCorrect) {
                    coordinates[i][j] = Integer.parseInt(String.valueOf(string.charAt(0)));
                    coordinates[i][j + 1] = Integer.parseInt(String.valueOf(string.charAt(2)));
                    i++;
                }
            }
            // Проверка на свободность координат #3 q5
            if (checkCorrect) {
                if (!this.myfield[coordinates[0][0]][coordinates[0][1]].equals("o") && !this.myfield[coordinates[0][0]][coordinates[0][1]].equals("=")) {
                    checkCorrect = true;
                } else {
                    System.out.println("Введенные координаты заняты!");
                    checkCorrect = false;
                }
            }
            if (checkCorrect) {
                this.printCoordinate(coordinates[0][0], coordinates[0][1], "o");
                this.printHalo(coordinates[0][0], coordinates[0][1]);
                check = true;
            }
        }
    }

    public void printCoordinate(int x, int y, String value) {
        this.myfield[x][y] = value;
    }

    public void printHalo(int x, int y) {
        int j = -1;
        for (int i = 0; i < 3; i++) {
            if (x != 0 && x != 9 && y != 0 && y != 9) {
                if (!this.myfield[x + j][y - 1].equals("o")) {
                    this.myfield[x + j][y - 1] = "=";
                }
                if (!this.myfield[x + j][y].equals("o")) {
                    this.myfield[x + j][y] = "=";
                }
                if (!this.myfield[x + j][y + 1].equals("o")) {
                    this.myfield[x + j][y + 1] = "=";
                }
                j++;
            } else if (x != 9 && y != 0 && y != 9) {
                j++;
                i++;
                if (!this.myfield[x + j][y - 1].equals("o")) {
                    this.myfield[x + j][y - 1] = "=";
                }
                if (!this.myfield[x + j][y].equals("o")) {
                    this.myfield[x + j][y] = "=";
                }
                if (!this.myfield[x + j][y + 1].equals("o")) {
                    this.myfield[x + j][y + 1] = "=";
                }
            } else if (x != 0 && y != 0 && y != 9) {
                if (!this.myfield[x + j][y - 1].equals("o")) {
                    this.myfield[x + j][y - 1] = "=";
                }
                if (!this.myfield[x + j][y].equals("o")) {
                    this.myfield[x + j][y] = "=";
                }
                if (!this.myfield[x + j][y + 1].equals("o")) {
                    this.myfield[x + j][y + 1] = "=";
                }
                j++;
                i++;
            } else if (x != 0 && x != 9 && y != 9) {
                if (!this.myfield[x + j][y].equals("o")) {
                    this.myfield[x + j][y] = "=";
                }
                if (!this.myfield[x + j][y + 1].equals("o")) {
                    this.myfield[x + j][y + 1] = "=";
                }
                j++;
            } else if (x != 0 && x != 9 && y != 0) {
                if (!this.myfield[x + j][y - 1].equals("o")) {
                    this.myfield[x + j][y - 1] = "=";
                }
                if (!this.myfield[x + j][y].equals("o")) {
                    this.myfield[x + j][y] = "=";
                }
                j++;
            } else if (x == 0 && y == 0) {
                j++;
                i++;
                if (!this.myfield[x + j][y].equals("o")) {
                    this.myfield[x + j][y] = "=";
                }
                if (!this.myfield[x + j][y + 1].equals("o")) {
                    this.myfield[x + j][y + 1] = "=";
                }
            } else if (x == 0 && y == 9) {
                j++;
                i++;
                if (!this.myfield[x + j][y - 1].equals("o")) {
                    this.myfield[x + j][y - 1] = "=";
                }
                if (!this.myfield[x + j][y].equals("o")) {
                    this.myfield[x + j][y] = "=";
                }
            } else if (x == 9 && y == 0) {
                if (!this.myfield[x + j][y].equals("o")) {
                    this.myfield[x + j][y] = "=";
                }
                if (!this.myfield[x + j][y + 1].equals("o")) {
                    this.myfield[x + j][y + 1] = "=";
                }
                j++;
                i++;
            } else if (x == 9 && y == 9) {
                if (!this.myfield[x + j][y - 1].equals("o")) {
                    this.myfield[x + j][y - 1] = "=";
                }
                if (!this.myfield[x + j][y].equals("o")) {
                    this.myfield[x + j][y] = "=";
                }
                j++;
                i++;
            }
        }
    }
}

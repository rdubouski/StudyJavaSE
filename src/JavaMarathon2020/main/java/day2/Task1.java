package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x >= 1 && x <= 4) System.out.println("Малоэтажный дом");
        if (x >= 5 && x <= 8) System.out.println("Среднеэтажный дом");
        if (x >= 9) System.out.println("Многоэтажный дом");
        if (x <= 1) System.out.println("Ошибка ввода");
    }
}
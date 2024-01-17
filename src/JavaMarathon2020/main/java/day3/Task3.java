package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double a, b;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i < 5){
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            if (b == 0) {
                System.out.println("Деление на 0");
                i++;
                continue;
            }
            System.out.println(a / b);
            i++;
        }
    }
}

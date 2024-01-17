package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        while (true){
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            if (b == 0) return;
            System.out.println(a / b);
        }
    }
}
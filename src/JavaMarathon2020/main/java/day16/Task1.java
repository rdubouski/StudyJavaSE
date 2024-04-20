package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "./txt/JavaMarathon2020/day16/task1.txt";

        File file = new File(path);

        printResult(file);

    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            int sum = 0;
            double res;
            for (String string : numbers) {
                sum += Integer.parseInt(string);
            }

            res = (double) sum / numbers.length;

            System.out.printf(res + " --> %.3f", res);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

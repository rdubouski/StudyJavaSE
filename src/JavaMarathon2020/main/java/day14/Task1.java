package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String path = "./txt/JavaMarathon2020/day14/task1.txt";

        File file = new File(path);

        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] strings = line.split(" ");
            if (strings.length != 10) {
                throw new IllegalArgumentException();
            }
            int sum = 0;

            for (String string : strings) {
                sum += Integer.parseInt(string);
            }

            System.out.println(sum);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}

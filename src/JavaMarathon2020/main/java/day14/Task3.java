package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String path = "./txt/JavaMarathon2020/day14/people.txt";

        File file = new File(path);

        System.out.println(parseFileToObjList(file));

    }

    public static List<Person> parseFileToObjList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<Person> people = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                people.add(new Person(person[0], Integer.parseInt(person[1])));
            }

            return people;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }

}


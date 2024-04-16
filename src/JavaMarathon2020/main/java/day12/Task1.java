package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Lada");
        list.add("Fiat");
        list.add("Seat");
        list.add("Mini");

        System.out.println(list);

        list.add(2, "Opel");

        list.removeFirst();

        System.out.println(list);
    }
}
/*
Напишите программу, которая находила бы все простые числа в диапазоне от 2 до 100
 */

package BookSchildtFirst.main.chapter2;

public class Task10 {

    public static void main(String[] args) {
        boolean check;
        for (int i = 2; i <= 100; i++) {
            check = true;
            for (int j = 2; j <= i / 2; j++) {
                if ((i % j) == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }

}

/*
Написать программу перевода дюймов в метры.
Вывсети значения длинны до 12 футов через каждый дюйм.
После каждых 12 дюймов вывести пустую строку.
(1 м = 39.37 дюйма)
*/

package chapter1;

public class Task10 {

    public static void main(String[] args) {

        double inch, meter;
        int counter;

        counter = 0;

        for (inch = 1; inch <= 144; inch++){
            meter = inch / 39.37;
            System.out.printf("%.2f inch = %.2f meter\n", inch, meter);
            counter++;
            if (counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
}

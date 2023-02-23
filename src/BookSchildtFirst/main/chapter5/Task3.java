/*
Написать программу, в которой массив используется для нахождения среднего арифметического десяти значений double.
 */

package BookSchildtFirst.main.chapter5;

public class Task3 {
    public static void main(String[] args) {
        double array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double avg = 0;
        for (double x : array){
            avg = avg + x;
        }
        System.out.println("Avg = " + avg / 10);
    }
}

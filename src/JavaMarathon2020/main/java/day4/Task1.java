package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int i;
        int chet = 0;
        int nochet = 0;
        int count1 = 0;
        int count8 = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] A = new int[n];

        for (i = 0; i < n; i++){
            A[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(A));

        for (i = 0; i < n; i++){
            if (A[i] > 8) count8++;
            if (A[i] == 1) count1++;
            if (A[i] % 2 == 0) chet++;
            if (A[i] % 2 != 0) nochet++;
            sum = sum + A[i];
        }

        System.out.println("Длина массива: " + A.length);
        System.out.println("Количество чисел больше 8: " + count8);
        System.out.println("Количество чисел равных 1: " + count1);
        System.out.println("Количество четных чисел: " + chet);
        System.out.println("Количество нечетных чисел: " + nochet);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}

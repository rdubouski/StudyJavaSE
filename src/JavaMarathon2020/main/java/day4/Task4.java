package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] A = new int[100];
        int max = 0;
        int index = 0;
        int sum;

        for (int i = 0; i < 100; i++){
            A[i] = (int) (Math.random() * 10000);
        }

        System.out.println(Arrays.toString(A));

        for (int i = 0; i < 100 - 3; i++){
            sum = A[i] + A[i + 1] + A[i + 2];
            if (sum > max){
                max = sum;
                sum = 0;
                index = i;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Index = " + index);
    }
}

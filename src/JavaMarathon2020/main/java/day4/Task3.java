package day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int index = 0;
        int sum = 0;
        int max = 0;
        int[][] A = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = (int) (Math.random() * 50);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + A[i][j];
            }
            System.out.println(sum);
            if (sum >= max) {
                max = sum;
                sum = 0;
                index = i;
            }
        }

        System.out.println("Index = " + index);
    }
}

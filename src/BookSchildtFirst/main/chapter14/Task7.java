package chapter14;

interface NumericFunc {
    int func(int n);
}

public class Task7 {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = i * result;
            }

            return result;
        };

        System.out.println("Fact 3 = " + factorial.func(3));
        System.out.println("Fact 5 = " + factorial.func(5));
        System.out.println("Fact 9 = " + factorial.func(9));
    }
}

package chapter14;

interface MyFunc<T> {
    T func(T n);
}

public class Task8 {
    public static void main(String[] args) {
        MyFunc<Integer> factorial = (n) -> {
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
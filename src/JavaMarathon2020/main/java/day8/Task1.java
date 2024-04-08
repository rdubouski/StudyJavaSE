package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = "";
        StringBuilder stringBuilder = new StringBuilder("");
        long start;
        long finish;
        long difference;
        start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            string = string.concat(i + " ");
        }
        System.out.println(string);
        finish = System.currentTimeMillis();
        difference = finish - start;
        System.out.println(difference);

        start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(stringBuilder);
        finish = System.currentTimeMillis();
        difference = finish - start;
        System.out.println(difference);
    }
}

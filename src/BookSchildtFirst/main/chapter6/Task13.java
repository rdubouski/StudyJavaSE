/*
Создать метод sum (), имеющий список переменной длинны.
 */
package BookSchildtFirst.main.chapter6;

class SumIt{
    int result = 0;
    int sum(int ... n){
        for (int i = 0; i < n.length; i++){
            result = result + n[i];
        }
        return result;
    }
}

public class Task13 {
    public static void main(String[] args) {
        SumIt SI = new SumIt();

        int result = SI.sum(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("result = " + result);
    }
}

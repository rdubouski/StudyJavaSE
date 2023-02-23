/*
Написать программу сортировки массива строк.
 */

package BookSchildtFirst.main.chapter5;

public class Task4 {
    public static void main(String[] args) {
        String array[] = {"qwe", "asd", "zxc", "rty", "fgh", "vbn"};
        String tmp;

        System.out.println("Current array");
        for (String str : array){
            System.out.println(str);
        }
        for (int i = 1; i < array.length; i++){
            for (int j = array.length - 1; j >= i; j--){
                if ((array[j - 1].compareTo(array[j])) > 0){
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("Sort array");
        for (String str : array){
            System.out.println(str);
        }
    }
}

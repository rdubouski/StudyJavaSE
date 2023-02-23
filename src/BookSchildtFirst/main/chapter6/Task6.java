/*
Рекурсивный метод, отображающий строку задом наперед.
 */
package BookSchildtFirst.main.chapter6;
class Backprint{
    String str;
    Backprint(String s){
        str = s;
    }

    void backprint(int i){
        if(i < str.length() - 1){
            backprint(i + 1);
        }
        System.out.print(str.charAt(i));
    }
}

public class Task6 {

    public static void main(String[] args) {
        String str = new String("test string");
        System.out.println("in = " + str);
        Backprint oBack = new Backprint(str);
        System.out.print("out = ");
        oBack.backprint(0);
    }
}

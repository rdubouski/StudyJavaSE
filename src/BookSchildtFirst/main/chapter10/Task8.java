/*
Перепишите программу, созданную в предыдущем пункте, таким образом,
чтобы в ней использовались классы, представляющие символьные потоки.
На этот раз воспользуйтесь инструкцией try с ресурсами для автоматического закрытия файла.
 */
package BookSchildtFirst.main.chapter10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task8 {
    public static void main(String[] args) {
        int i;

        try (FileReader fin = new FileReader("./txt/BookSchildtFirst/Task10/source.txt");
             FileWriter fout = new FileWriter("./txt/BookSchildtFirst/Task10/target.txt")) {
            do {
                i = fin.read();
                if ((char) i == ' ') {
                    i = '-';
                }
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Input-output error : " + exc);
        }
    }

}

/*
Напишите программу для копирования текстовых файлов. Видоизмените ее
таким образом, чтобы все пробелы заменялись дефисами. Используйте при
написании программы классы, представляющие байтовые потоки, а также
традиционный способ закрытия файла явным вызовом метода close()
 */
package BookSchildtFirst.main.chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task7 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream("./txt/BookSchildtFirst/Task10/source.txt");
            fout = new FileOutputStream("./txt/BookSchildtFirst/Task10/target.txt");

            do {
                i = fin.read();
                if ((char) i == ' ') {
                    i = '-';
                }
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Input-output error : " + exc);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Close input file error : " + exc);
            }
            try {
                if (fin != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Close output file error : " + exc);
            }
        }
    }

}

/*
Сила тяжести на Луне составляет около 17% земной.
Напиши программу, которая вычислила бы ваш вес на Луне.
*/

package chapter1;

public class Task09 {
    public static void main(String[] args) {

        double earthweight, moonweight;

        earthweight = 115;
        moonweight = earthweight * 0.17;
        System.out.println(earthweight + " weight on earth = " + moonweight + " weight on the moon");
    }
}
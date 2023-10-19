package chapter12;

enum Tools {
    SCREWDRIVER, WRENCH, HAMMER,PLIERS
}

public class Task3 {
    public static void main(String[] args) {
        for (Tools tls : Tools.values()) {
            System.out.println("Value " + tls + " Number " + tls.ordinal());
        }
    }
}

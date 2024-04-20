package day13;

public class Task1 {
    public static void main(String[] args) {

        User u1 = new User("u1");
        User u2 = new User("u2");
        User u3 = new User("u3");

        u1.sendMessage(u2 , "qwe");
        u1.sendMessage(u2, "asd");

        u2.sendMessage(u1, "rty");
        u2.sendMessage(u1, "fgh");
        u2.sendMessage(u1, "vbn");

        u3.sendMessage(u1, "iop");
        u3.sendMessage(u1, "kl;");
        u3.sendMessage(u1, "m,.");

        u1.sendMessage(u3, "789");
        u1.sendMessage(u3, "456");
        u1.sendMessage(u3, "123");

        u3.sendMessage(u1, "000");

        MessageDatabase.showDialog(u1, u3);

    }
}

package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher bob = new Teacher("Bob", "Math");
        Student bill = new Student("Bill");
        bob.evaluate(bill, 4);

        Teacher mark = new Teacher("Mark", "Prog");
        Student john = new Student("John");
        mark.evaluate(john, 5);
    }
}

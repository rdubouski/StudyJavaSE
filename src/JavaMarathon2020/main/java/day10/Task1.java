package day10;

public class Task1 {
    public static void main(String[] args) {
        Node root = new Node(20);
        root.insert(root, 14);
        root.insert(root, 23);
        root.insert(root, 11);
        root.insert(root, 16);
        root.insert(root, 22);
        root.insert(root, 27);
        root.insert(root, 5);
        root.insert(root, 15);
        root.insert(root, 18);
        root.insert(root, 24);
        root.insert(root, 150);
        root.insert(root, 8);
        root.print(root);
    }
}

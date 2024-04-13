package day10;

public class Node {
    public Node left;
    public Node right;
    public int value;

    public Node(int v) {
        value = v;
    }

    public void insert(Node root, int v) {
        if (v < root.value)
            if ( left != null ) {
                root = left;
                left.insert(root, v);
            }
            else {
                left = new Node(v);
                System.out.println("left " + left.value);
            }
        else
        if ( right != null ) {
            root = right;
            right.insert(root, v);
        }
        else {
            right = new Node(v);
            System.out.println("right " + right.value);
        }
    }

    public void print(Node node){
        if(node != null){
            print(node.left);
            System.out.println(node.value);
            print(node.right);
        }
    }
}
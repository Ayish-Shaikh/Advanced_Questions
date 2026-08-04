package Trees.BinaryTrees;

public class Node {
    int data;
    Node Left;
    Node Right;

    Node (int data){
        this.data = data;
        Left = null;
        Right = null;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.Left = new Node(2);
        root.Right = new Node(3);

        root.Left.Left = new Node(4);
        root.Left.Right = new Node(5);

        root.Right.Left = new Node(6);
        root.Right.Right = new Node(7);

        System.out.println(root.data);

        System.out.println(root.Left.data);
        System.out.println(root.Right.data);

        System.out.println(root.Left.Left.data);
        System.out.println(root.Left.Right.data);

        System.out.println(root.Right.Left.data);
        System.out.println(root.Right.Right.data);
    }
}

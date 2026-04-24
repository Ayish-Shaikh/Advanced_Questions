package practisequestions.linkedList;

public class searchLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static void traverse(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean Search(Node head, int val){
        Node temp = head;

        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);

        int val = 2;
        traverse(head);

        if (Search(head, val)) {
            System.out.println("element found " + val);
        }
        else {
            System.out.println("not found " + val);
        }
    }
}
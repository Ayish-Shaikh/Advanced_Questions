package LinkedList;

public class SearchInSLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
    public static boolean Search(Node head, int val) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(3);

        int val = 1;

        if (Search(head, val)){
            System.out.println("Element Found :) " );
        }
        else {
            System.out.println("Element Not Found :( ");
        }
    }
}

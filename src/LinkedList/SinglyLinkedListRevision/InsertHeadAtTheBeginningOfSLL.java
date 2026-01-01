package LinkedList.SinglyLinkedListRevision;

public class InsertHeadAtTheBeginningOfSLL {

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

    public static Node insertHead(Node head, int val){
        Node temp = new Node(val);
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {
            Node head = new Node(2);
            head.next = new Node(5);
            head.next.next = new Node(7);
            head.next.next.next = new Node(11);
            head.next.next.next.next = new Node(1);
            head.next.next.next.next.next = new Node(3);

            System.out.println("Before Inserting any element at the head of the node: ");
            traverse(head);

            System.out.println("After Inserting any element at the head of the node: ");
            head = insertHead(head, 100);
            traverse(head);
    }
}

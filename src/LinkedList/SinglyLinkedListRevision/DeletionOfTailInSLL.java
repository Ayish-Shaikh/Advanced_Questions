package LinkedList.SinglyLinkedListRevision;

public class DeletionOfTailInSLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public static void traverse(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node RemoveTail(Node head){
        if (head == null || head.next ==null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(3);

        System.out.println("Before Deleting the tail of the node: ");
        traverse(head);

        System.out.println("After deleting the tail of the node: ");
        head = RemoveTail(head);
        traverse(head);
    }
}

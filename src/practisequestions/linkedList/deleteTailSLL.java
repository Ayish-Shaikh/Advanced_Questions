package practisequestions.linkedList;

public class deleteTailSLL {
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

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node removeTail(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp =temp.next;
        }
        temp.next = null;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);

        System.out.println("Before inserting head: ");
        traverse(head);

        System.out.println("After inserting head: ");
        head = removeTail(head);
        traverse(head);
    }
}

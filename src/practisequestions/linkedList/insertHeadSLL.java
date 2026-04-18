package practisequestions.linkedList;

public class insertHeadSLL {
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
    public static Node insertHead(Node head, int var){
        Node temp = new Node(var);
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);

        System.out.println("Before inserting head: ");
        traverse(head);

        System.out.println("After inserting head: ");
        head = insertHead(head,8);
        traverse(head);

    }
}

package LinkedList.RevisionALL;

public class SinglyLL_Revision {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    //traversing
    public static void traverse(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //searching
    public static boolean search(Node head, int val){
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //delete head of SLL
    public static Node removeHead(Node head){
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    //delete tail of SLL
    public static Node removeTail(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    //deleting kth
    public static Node removeKth(Node head, int k){
        if (head == null) {
            return null;
        }
        if (k == 1) {
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    //inserting at head
    public static Node insertHead(Node head, int val){
        Node temp = new Node(val);
        temp.next = head;
        return temp;
    }

    //insert at tail
    public static Node insertTail(Node head,  int val){
        Node newNode = new Node(val);

        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    //insert at kth


    //MAIN
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        traverse(head);

        int val = 2;//searching the number if its present
        if (search(head, val)) {
            System.out.println("ELEMENT FOUND:) ");
        }
        else {
            System.out.println("NOT FOUND:( !!!");
        }

        System.out.println("BEFORE DELETING HEAD: ");
        traverse(head);

        System.out.println("AFTER DELETING HEAD: ");
        head = removeHead(head);
        traverse(head);

        System.out.println("BEFORE DELETING TAIL: ");
        traverse(head);

        System.out.println("AFTER DELETING TAIL: ");
        head = removeTail(head);
        traverse(head);

        System.out.println("BEFORE DELETION OF KTH: ");
        traverse(head);

        System.out.println("AFTER DELETION OF KTH: ");
        head = removeKth(head,2);
        traverse(head);

        System.out.println("BEFORE INSERTING HEAD: ");
        traverse(head);

        System.out.println("AFTER INSERTING HEAD: ");
        head = insertHead(head, 1);
        traverse(head);

        System.out.println("BEFORE INSERTING AT TAIL: ");
        traverse(head);

        System.out.println("AFTER INSERTING AT TAIL: ");
        head = insertTail(head, 3);
        traverse(head);


    }
}

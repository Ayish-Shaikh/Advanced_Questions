package LinkedList.DoublyLinkedList;

public class DeletionOfTailInDLL {
    public static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void traverse(Node head){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node convertArr2DLL(int[] arr){
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++){
            Node curr = new Node(arr[i]);
            curr.prev = prev;
            prev.next = curr;
            prev = curr;
        }
        return head;
    }

    public static Node DeleteTail(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;
        return head;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 9, 16, 1, 17};

        Node head = convertArr2DLL(arr);
        System.out.println("Before Deleting tail : ");
        traverse(head);

        head = DeleteTail(head);

        System.out.println("After Deleting tail : ");
        traverse(head);}
    }
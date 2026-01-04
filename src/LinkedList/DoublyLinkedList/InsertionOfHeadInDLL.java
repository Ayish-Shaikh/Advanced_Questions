package LinkedList.DoublyLinkedList;

public class InsertionOfHeadInDLL {
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

    public static Node InsertBeforeHead(Node head, int val){
        Node newHead = new Node(val);
        head.prev = newHead;
        newHead.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 9, 16, 1, 17};

        Node head = convertArr2DLL(arr);
        System.out.println("Before Inserting Before the head  : ");
        traverse(head);

        head = InsertBeforeHead(head, 5);

        System.out.println("After Inserting Before the head : ");
        traverse(head);
    }
}
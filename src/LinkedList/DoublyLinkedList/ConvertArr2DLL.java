package LinkedList.DoublyLinkedList;

public class ConvertArr2DLL {
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

        while(head != null){
            System.out.print(head.data + " <-> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node Convertarr2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i< arr.length; i++){
            Node temp = new Node(arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 9, 16, 1, 17};
        Node head = Convertarr2DLL(arr);
        traverse(head);
    }
}

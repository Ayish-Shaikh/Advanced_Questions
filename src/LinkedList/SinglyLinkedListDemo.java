package LinkedList;

public class SinglyLinkedListDemo {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    private static Node convertarr2ll(int[] arr1){
        Node head = new Node(arr1[0]);
        Node mover = head;

        for (int i = 0; i < arr1.length; i++) {
            Node temp = new Node(arr1[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 9, 16, 1, 17};
        Node node = new Node(arr[3]);
        System.out.println(node.data);

        //array to linkedlist
        int[] arr1 = {2, 4, 3, 9, 16, 1, 17};
        Node head = convertarr2ll(arr1);
        System.out.println(head.data);
    }
}

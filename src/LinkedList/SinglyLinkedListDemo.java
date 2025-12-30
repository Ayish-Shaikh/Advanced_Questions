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

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 9, 16, 1, 17};
        Node node = new Node(arr[3]);
        System.out.println(node.data);
    }
}

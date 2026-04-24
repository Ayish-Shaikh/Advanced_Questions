package practisequestions.linkedList;

public class insertHeadDLL {
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
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node convertarr2dll(int[] arr){
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);

        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node curr = new Node(arr[i]);
            curr.prev = prev;
            prev.next = curr;

            prev = curr;
        }
        return head;
    }

    public static Node insertbeforeheadDLL(Node head, int var){
        Node temp = new Node(var);
        head.prev = temp;
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};

        Node head = convertarr2dll(arr);

        head = insertbeforeheadDLL(head, 1);
        traverse(head);
    }
}

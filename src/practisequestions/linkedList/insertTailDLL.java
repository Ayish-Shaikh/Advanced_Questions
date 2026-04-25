package practisequestions.linkedList;

public class insertTailDLL {
    public static class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void traverse(Node head){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp=temp.next;
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

    public static Node insertbeforeheadDLL(Node head, int val){
        Node newHead = new Node(val);
        head.prev = newHead;
        newHead.next = head;

        return newHead;
    }

    public static Node insertbeforeTail(Node head, int var){
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.prev;
        Node newNode = new Node(var);

        prev.next = newNode;
        newNode.prev = prev;

        newNode.next = tail;
        tail.prev = newNode;

        return head;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};

        Node head = convertarr2dll(arr);

        head = insertbeforeTail(head, 6);
        traverse(head);
    }
}

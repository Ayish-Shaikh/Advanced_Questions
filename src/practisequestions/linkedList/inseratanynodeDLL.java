package practisequestions.linkedList;

public class inseratanynodeDLL {
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

    public static Node insertatanyNode(Node head, int val, int k){
        if (k == 1) {
            Node newNode = new Node(val);
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        Node temp = head;
        int count = 1;

        while (count < k-1) {
            temp = temp.next;
            count++;
        }
        Node nextNode = temp.next;
        Node node = new Node(val);
        node.prev = temp;
        node.next = nextNode;
        temp.next = node;
        if (nextNode != null) {
            nextNode.prev = node;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6};
        Node head = convertarr2dll(arr);

        head = insertatanyNode(head, 4, 3);
        traverse(head);
    }
}

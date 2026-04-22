package practisequestions.linkedList;

public class insertKSLL {
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
    public static Node insertK(Node head, int var, int k){
        if (k == 1) {
            Node newNode = new Node(var);
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;

            if (count == k - 1) {
                Node node = new Node(var);
                node.next = temp.next;
                temp.next = node;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);

        System.out.println("Before inserting head: ");
        traverse(head);

        System.out.println("After inserting head: ");
        head = insertK(head,10,3);
        traverse(head);
    }
}

package LinkedList.SinglyLinkedListRevision;

public class InsertAtTheKthInSLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static void traverse(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node Insertk(Node head, int element, int k) {

        if (k == 1) {
            Node newNode = new Node(element);
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            if (count == k - 1) {
                Node node = new Node(element);
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
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(3);

        System.out.println("Before Inserting head at any point of the node: ");
        traverse(head);

        System.out.println("After Inserting head at any point of the node: ");
        head = Insertk(head, 100, 4);
        traverse(head);
    }
}

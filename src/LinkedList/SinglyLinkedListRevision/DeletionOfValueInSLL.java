package LinkedList.SinglyLinkedListRevision;

public class DeletionOfValueInSLL {
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

    public static Node RemoveEl(Node head, int el) {
        if (head == null) {
            return head;
        }
        if (head.data == el) {
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == el) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
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

        System.out.println("Before Deleting any element of the node: ");
        traverse(head);

        System.out.println("After deleting any element of the node: ");
        head = RemoveEl(head, 11);
        traverse(head);
    }
}

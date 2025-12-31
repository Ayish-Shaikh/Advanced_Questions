package LinkedList.DoublyLinkedListREVISION;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList {

    Node head;

    // Delete the head node
    void deleteHead() {

        // Case 1: Empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Case 2: Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        // Case 3: More than one node
        head = head.next;
        head.prev = null;
    }

    // Insert at head (helper method)
    void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}


public class delheadnode {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtHead(30);
        dll.insertAtHead(20);
        dll.insertAtHead(10);

        System.out.println("Before deleting head:");
        dll.display();

        dll.deleteHead();

        System.out.println("After deleting head:");
        dll.display();
    }
}

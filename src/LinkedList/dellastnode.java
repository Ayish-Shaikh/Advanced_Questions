package LinkedList;

class Node1 {
    int data;
    Node1 prev;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList1 {

    Node1 head;

    // Delete the last node
    void deleteLast() {

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
        Node1 temp = head;

        // Traverse to the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Remove last node
        temp.prev.next = null;
    }

    // Insert at end (helper)
    void insertAtEnd(int data) {
        Node1 newNode1 = new Node1(data);

        if (head == null) {
            head = newNode1;
            return;
        }

        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode1;
        newNode1.prev = temp;
    }

    // Display list
    void display() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class dellastnode {
    public static void main(String[] args) {

        DoublyLinkedList1 dll = new DoublyLinkedList1();

        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);

        System.out.println("Before deleting last node:");
        dll.display();

        dll.deleteLast();

        System.out.println("After deleting last node:");
        dll.display();
    }
}

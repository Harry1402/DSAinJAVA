import java.util.*;


class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class LinkedList {
    Node head;

    void insertAtEnd(int x) {  // fixed method name
        Node temp = new Node(x);
        if (head == null) {
            head = temp;
        } else {
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = temp;
        }
    }
}

 void printList() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }




public class LinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.insertAtEnd(40);

        l1.printList();
    }
}
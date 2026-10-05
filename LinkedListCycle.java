package HashTable;

import java.util.*;

public class LinkedListCycle {
    class Node {
        int val;
        Node next;
        
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(Node head) {
        HashSet<Node> set = new HashSet<>();
        Node current = head;

        while (current != null) {

            // Node already visited
            if (set.contains(current)) {
                return true;
            }

            // Store current node
            set.add(current);

            // Move to next node
            current = current.next;
        }

        return false;
    }
    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = head;

        boolean result = hasCycle(head);
        System.out.println("Linked List has cycle: " + result);
    }
}

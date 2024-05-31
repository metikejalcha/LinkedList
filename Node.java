class Node {2
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Insert a node at a specified position
    void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete a node at a specified position
    void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        current.next = current.next.next;
    }

    // Delete a node after a given node
    void deleteAfterNode(Node prevNode) {
        if (prevNode == null || prevNode.next == null) {
            System.out.println("Previous node is null or last node");
            return;
        }
        prevNode.next = prevNode.next.next;
    }

    // Search for a node with a specific value
    boolean searchNode(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

class Stack {
    LinkedList stackList;

    Stack() {
        stackList = new LinkedList();
    }

    // Push operation
    void push(int data) {
        stackList.insertAtPos(data, 1);
    }

    // Pop operation
    void pop() {
        if (stackList.head == null) {
            System.out.println("Stack is empty");
            return;
        }
        stackList.deleteAtPosition(1);
    }

    // Peek operation
    void peek() {
        if (stackList.head == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + stackList.head.data);
    }
}




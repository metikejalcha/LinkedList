public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting nodes at specified positions
        list.insertAtPos(10, 1);
        list.insertAtPos(20, 2);
        list.insertAtPos(30, 2);

        // Deleting a node at a specified position
        list.deleteAtPosition(2);

        // Searching for a node
        System.out.println("Node with value 20 found: " + list.searchNode(20));

        // Implementing a stack
        Stack stack = new Stack();
        stack.push(50);
        stack.push(60);
        stack.peek();
        stack.pop();
        stack.peek();
    }
}

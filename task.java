class Task  {
    String title;
    String description;
    boolean completed;

    Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }
}

class Node {
    Task task;
    Node next;

    Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

class ToDoList {
    Node head;

    ToDoList() {
        this.head = null;
    }

    void addToDo(String title, String description) {
        Task newTask = new Task(title, description);
        Node newNode = new Node(newTask);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    boolean markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.task.title.equals(title)) {
                current.task.completed = true;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void viewToDoList() {
        Node current = head;
        if (current == null) {
            System.out.println("To-Do List is empty.");
        } else {
            System.out.println("To-Do List:");
            while (current != null) {
                System.out.println("Title: " + current.task.title + ", Description: " + current.task.description + ", Completed: " + current.task.completed);
                current = current.next;
            }
        }
    }
}








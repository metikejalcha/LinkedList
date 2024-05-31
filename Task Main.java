public class Main {
    public static void main(String[] args) {


    ToDoList toDoList = new ToDoList();

    // Adding tasks
        toDoList.addToDo("Task 1", "Description for Task 1");
        toDoList.addToDo("Task 2", "Description for Task 2");
        toDoList.addToDo("Task 3", "Description for Task 3");

    // Viewing initial to-do list
        toDoList.viewToDoList();

    // Marking Task 2 as completed
        toDoList.markToDoAsCompleted("Task 2");

    // Viewing updated to-do list
        toDoList.viewToDoList();
}
}

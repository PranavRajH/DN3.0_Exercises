package Exercise5;

public class Main {
    public static void main(String[] args) {
        TaskManagementSystem taskManagementSystem = new TaskManagementSystem();
        taskManagementSystem.addTask(new Task("T1", "Task 1", "Pending"));
        taskManagementSystem.addTask(new Task("T2", "Task 2", "In Progress"));
        taskManagementSystem.addTask(new Task("T3", "Task 3", "Completed"));
        taskManagementSystem.traverseTasks();
        System.out.println(taskManagementSystem.searchTask("T2"));
        taskManagementSystem.deleteTask("T2");
        taskManagementSystem.traverseTasks();
    }
}

package To_do_list;

import java.util.LinkedList;

public class User {
    private String name;
    private LinkedList<Task> taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new LinkedList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void markTaskCompleted(int index) {
        if (index >= 0 && index < taskList.size()) {
            taskList.get(index).markCompleted();
        }
    }

    public void printTasks() {
        System.out.println("Tasks for user " + name + ":");
        for (Task task : taskList) {
            System.out.println(task.getDescription() + " (Completed: " + task.isCompleted() + ")");
        }
    }
}

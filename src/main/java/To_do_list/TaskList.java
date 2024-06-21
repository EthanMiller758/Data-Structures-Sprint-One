package To_do_list;

import java.util.LinkedList;

public class TaskList {
    private LinkedList<Task> tasks;

    public TaskList() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void markTaskCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
        }
    }

    public void printTasks() {
        for (Task task : tasks) {
            System.out.println(task.getDescription() + " (Completed: " + task.isCompleted() + ")");
        }
    }
}

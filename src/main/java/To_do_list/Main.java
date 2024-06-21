package To_do_list;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User[] users = new User[10];

        User user1 = new User("Samantha");
        users[0] = user1;

        Task task1 = new Task("Buy groceries");
        user1.addTask(task1);

        Task task2 = new Task("Read a book");
        user1.addTask(task2);

        user1.markTaskCompleted(0);

        for (User user : users) {
            if (user != null) {
                user.printTasks();
            }
        }

        scanner.close();
    }
}

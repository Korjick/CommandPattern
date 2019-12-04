package receiver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    private ArrayList<String> tasks;
    private Scanner in;
    private final String[] COMMAND_NAMES = { "exit", "help", "add", "read", "readAll", "remove" };

    public App(Scanner in) {
        tasks = new ArrayList<>();
        this.in = in;
    }

    public void createTask() {
        tasks.add(in.nextLine());
    }

    public void runHelp() {
        System.out.println("Commands that can be ran: " + Arrays.toString(COMMAND_NAMES));
    }

    public void showAll() {
        if (tasks.size() > 0) {
            for (String task : tasks) {
                printTask(task);
            }
        } else {
            System.out.println("No tasks has been saved.");
        }
    }

    public void showOne() {
        int number = Integer.parseInt(in.nextLine().trim());
        int index = number - 1;
        if (index < 0) {
            System.out.println("Number must not be negative or zero.");
            showOne();
        } else if (index >= tasks.size()) {
            System.out.println("There is no task with that index.");
        } else {
            printTask(tasks.get(index));
        }
    }

    public void remove(){
        int number = Integer.parseInt(in.nextLine().trim());
        int index = number - 1;
        if (index < 0) {
            System.out.println("Number must not be negative or zero.");
            remove();
        } else if (index >= tasks.size()) {
            System.out.println("There is no task with that index.");
        } else {
            tasks.remove(index);
        }
    }

    private void printTask(String task) {
        System.out.println("Task: " + task);
    }
}

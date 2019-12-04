import commands.*;
import invoker.Switch;
import receiver.App;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        App app = new App(in);

        Command switchCreateTaskCommand = new CreateTaskCommand(app);
        Command switchRunHelpCommand = new RunHelpCommand(app);
        Command switchShowAllCommand = new ShowAllCommand(app);
        Command switchShowOneCommand = new ShowOneCommand(app);
        Command switchRemoveCommand = new RemoveCommand(app);

        Switch invoker = new Switch(switchCreateTaskCommand, switchRunHelpCommand,
                switchShowAllCommand, switchShowOneCommand, switchRemoveCommand);

        while (true) {
            System.out.println("\n Please input command.");
            String command = in.nextLine().trim();
            switch (command) {
                case "add":
                    invoker.createTaskCommand();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "help":
                    invoker.runHelpCommand();
                    break;
                case "read":
                    invoker.showOneCommand();
                    break;
                case "readAll":
                    invoker.showAllCommand();
                    break;
                case "remove":
                    invoker.removeCommand();
                    break;
                default:
                    System.out.println("Unknown command");
                    invoker.runHelpCommand();
                    break;
            }
        }
    }
}

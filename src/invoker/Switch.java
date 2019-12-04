package invoker;

import commands.Command;

public class Switch {

    private Command createTaskCommand;
    private Command runHelpCommand;
    private Command showAllCommand;
    private Command showOneCommand;
    private Command removeCommand;

    public Switch(Command createTaskCommand, Command runHelpCommand, Command showAllCommand, Command showOneCommand, Command removeCommand) {
        this.createTaskCommand = createTaskCommand;
        this.runHelpCommand = runHelpCommand;
        this.showAllCommand = showAllCommand;
        this.showOneCommand = showOneCommand;
        this.removeCommand = removeCommand;
    }

    public void createTaskCommand(){
        createTaskCommand.execute();
    }

    public void runHelpCommand(){
        runHelpCommand.execute();
    }

    public void showAllCommand(){
        showAllCommand.execute();
    }

    public void showOneCommand(){
        showOneCommand.execute();
    }

    public void removeCommand(){ removeCommand.execute(); }
}

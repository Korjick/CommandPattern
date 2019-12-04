package commands;

import receiver.App;

public class CreateTaskCommand implements Command {

    private App app;

    public CreateTaskCommand(App app){
        this.app = app;
    }

    @Override
    public void execute() {
        app.createTask();
    }
}

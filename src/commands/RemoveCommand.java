package commands;

import receiver.App;

public class RemoveCommand implements Command{
    private App app;

    public RemoveCommand(App app){
        this.app = app;
    }

    @Override
    public void execute() {
        app.remove();
    }
}

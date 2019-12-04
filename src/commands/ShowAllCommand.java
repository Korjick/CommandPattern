package commands;

import receiver.App;

public class ShowAllCommand implements Command {

    private App app;

    public ShowAllCommand(App app){
        this.app = app;
    }

    @Override
    public void execute() {
        app.showAll();
    }
}

package commands;

import receiver.App;

public class ShowOneCommand implements Command {

    private App app;

    public ShowOneCommand(App app){
        this.app = app;
    }

    @Override
    public void execute() {
        app.showOne();
    }
}

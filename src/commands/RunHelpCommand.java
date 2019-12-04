package commands;

import receiver.App;

public class RunHelpCommand implements Command {

    private App app;

    public RunHelpCommand(App app){
        this.app = app;
    }

    @Override
    public void execute() {
        app.runHelp();
    }
}

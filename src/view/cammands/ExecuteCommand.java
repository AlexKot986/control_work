package view.cammands;

import view.UserUI;

public class ExecuteCommand implements CommandsMenu {
    private UserUI userUI;
    public ExecuteCommand(UserUI userUI) {
        this.userUI = userUI;
    }
    @Override
    public String getDescription() {
        return "Выполнить команду";
    }

    @Override
    public void execute() {
        userUI.executeCommand();
    }
}

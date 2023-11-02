package view.cammands;

import view.UserUI;

public class FinishWork implements CommandsMenu {
    private UserUI userUI;
    public FinishWork(UserUI userUI) {
        this.userUI = userUI;
    }
    @Override
    public String getDescription() {
        return "Закончить работу";
    }

    @Override
    public void execute() {
        userUI.finishWork();
    }
}

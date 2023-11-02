package view.cammands;

import view.UserUI;

public class LearnCommand implements CommandsMenu {
    private UserUI userUI;
    public LearnCommand(UserUI userUI) {
        this.userUI = userUI;
    }
    @Override
    public String getDescription() {
        return "Изучить команду";
    }

    @Override
    public void execute() {
        userUI.learnCommand();
    }
}

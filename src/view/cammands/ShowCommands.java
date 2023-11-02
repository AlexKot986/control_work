package view.cammands;

import view.UserUI;

public class ShowCommands implements CommandsMenu {
    private UserUI userUI;
    public ShowCommands(UserUI userUI) {
        this.userUI = userUI;
    }

    @Override
    public String getDescription() {
        return "Показать команды питомца";
    }

    @Override
    public void execute() {
        userUI.showPetCommands();
    }
}

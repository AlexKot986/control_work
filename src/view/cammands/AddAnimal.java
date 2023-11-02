package view.cammands;

import view.UserUI;

public class AddAnimal implements CommandsMenu {
    private UserUI userUI;

    public AddAnimal(UserUI userUI) {
        this.userUI = userUI;
    }
    @Override
    public String getDescription() {
        return "Добавить новое животное";
    }

    @Override
    public void execute() {
        userUI.addAnimal();
    }
}

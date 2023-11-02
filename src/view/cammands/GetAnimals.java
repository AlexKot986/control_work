package view.cammands;

import view.UserUI;

public class GetAnimals implements CommandsMenu {
    private UserUI userUI;
    public GetAnimals(UserUI userUI) {
        this.userUI = userUI;
    }
    @Override
    public String getDescription() {
        return "Список животных";
    }

    @Override
    public void execute() {
        userUI.getAnimals();
    }
}

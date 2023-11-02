package view;

import view.cammands.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserMenu {

    private List<CommandsMenu> commandsMenu;

    public UserMenu(UserUI userUI) {
        commandsMenu = new ArrayList<>();
        commandsMenu.add(new GetAnimals(userUI));
        commandsMenu.add(new AddAnimal(userUI));
        commandsMenu.add(new ShowCommands(userUI));
        commandsMenu.add(new LearnCommand(userUI));
        commandsMenu.add(new ExecuteCommand(userUI));
        commandsMenu.add(new FinishWork(userUI));
    }
    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandsMenu.size(); i++) {
            stringBuilder.append(String.format("%d. %s\n",i + 1, commandsMenu.get(i).getDescription()));
        }
        return stringBuilder.toString();
    }

    public void execute(int choice) throws IOException, ClassNotFoundException {
        commandsMenu.get(choice - 1).execute();
    }

    public int sizeMenu() {
        return commandsMenu.size();
    }
}

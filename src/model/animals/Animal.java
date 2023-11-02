package model.animals;

import model.petsCommand.Command;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private String birthDate;
    private List<Command> commands;

    public Animal(String name, String birthDate) {
        commands = new ArrayList<>();
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public List<Command> getCommands() {
        return commands;
}

    public void learnCommand(Command command) {
        commands.add(command);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " [name: " + name + ", birthDate: " + birthDate + "]" + showCommands();
    }
    private String showCommands() {
        if (commands.size() == 0) return " команд не знает";
        List<String> list = new ArrayList<>();
        for (Command command : commands)
            list.add(command.description());
        return " знает команды " + list.toString();
    }
}


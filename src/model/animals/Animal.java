package model;

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
        if (isDate(birthDate))
            this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCommands() {
        StringBuilder sb = new StringBuilder();
        for (Command command : commands) {
            sb.append(command.description());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void learnCommand(Command command) {
        commands.add(command);
    }

    public void setBirthDate(String date) {
        if (isDate(date))
            birthDate = date;
        else
            System.out.println("Не верный формат ####.##.##");
    }

    private boolean isDate(String s) {
        return s.matches("([0-9]{4}).([0-9]{2}).([0-9]{2})");
    }
}
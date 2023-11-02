package model;

import model.Animal;
import model.Command;

public class Sit implements Command {
    @Override
    public String description() {
        return "команда сидеть";
    }

    @Override
    public void execute(Animal animal) {
        System.out.println(animal.getName() + " сидит!");;
    }
}

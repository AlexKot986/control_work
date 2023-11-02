package model.petsCommand;

import model.animals.Animal;

public class Walk implements Command {
    private Animal animal;
    public Walk(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String description() {
        return "Гулять";
    }

    @Override
    public void execute() {
        System.out.println(animal.getClass().getSimpleName() + " " + animal.getName() + " гуляет!\n");
    }
}

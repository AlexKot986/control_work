package model.petsCommand;

import model.animals.Animal;

public class Bite implements Command {
    private Animal animal;
    public Bite(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String description() {
        return "Кусать";
    }

    @Override
    public void execute() {
        System.out.println(animal.getClass().getSimpleName() + " " + animal.getName() + " кусается!\n");
    }
}

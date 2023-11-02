package model.petsCommand;

import model.animals.Animal;

public class Sit implements Command {
    private Animal animal;
    public Sit(Animal animal) {
        this.animal = animal;
    }
    @Override
    public String description() {
        return "Сидеть";
    }

    @Override
    public void execute() {
        System.out.println(animal.getClass().getSimpleName() + " " + animal.getName() + " сидит!\n");;
    }
}

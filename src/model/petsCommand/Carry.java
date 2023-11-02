package model.petsCommand;

import model.animals.Animal;

public class Carry implements Command {
    private Animal animal;
    public Carry(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String description() {
        return "Таскать";
    }

    @Override
    public void execute() {
        System.out.println(animal.getClass().getSimpleName() + " " + animal.getName() + " тащит груз!\n");
    }
}

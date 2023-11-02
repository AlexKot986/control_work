package model.petsCommand;

import model.animals.Animal;

public class Eat implements Command{
    private Animal animal;
    public Eat(Animal animal) {
        this.animal = animal;
    }
    @Override
    public String description() {
        return "Кушать";
    }

    @Override
    public void execute() {
        System.out.println(animal.getClass().getSimpleName() + " " + animal.getName() + " кушает!\n");
    }
}

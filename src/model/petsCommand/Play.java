package model.petsCommand;

import model.animals.Animal;

public class Play implements Command {
    private Animal animal;
    public Play(Animal animal) {
        this.animal = animal;
    }
    @Override
    public String description() {
        return "Играть";
    }

    @Override
    public void execute() {
        System.out.println(animal.getClass().getSimpleName() + " " + animal.getName() + " играет!\n");
    }
}

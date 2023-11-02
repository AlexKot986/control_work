package model.learnerCommands;

import model.animals.Animal;
import model.petsCommand.Carry;

public class CarryLearner implements Learner {
    @Override
    public String description() {
        return "Таскать";
    }

    @Override
    public void learn(Animal animal) {
        animal.learnCommand(new Carry(animal));
    }
}

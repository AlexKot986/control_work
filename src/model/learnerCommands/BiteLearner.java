package model.learnerCommands;

import model.animals.Animal;
import model.petsCommand.Bite;

public class BiteLearner implements Learner {
    @Override
    public String description() {
        return "Кусать";
    }

    @Override
    public void learn(Animal animal) {
        animal.learnCommand(new Bite(animal));
    }
}

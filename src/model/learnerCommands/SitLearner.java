package model.learnerCommands;

import model.animals.Animal;
import model.petsCommand.Sit;

public class SitLearner implements Learner {
    @Override
    public String description() {
        return "Сидеть";
    }

    @Override
    public void learn(Animal animal) {
        animal.learnCommand(new Sit(animal));
    }
}
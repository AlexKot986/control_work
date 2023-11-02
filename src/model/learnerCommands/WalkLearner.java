package model.learnerCommands;

import model.animals.Animal;
import model.petsCommand.Walk;

public class WalkLearner implements Learner {
    @Override
    public String description() {
        return "Гулять";
    }

    @Override
    public void learn(Animal animal) {
        animal.learnCommand(new Walk(animal));
    }
}
package model.learnerCommands;

import model.animals.Animal;
import model.petsCommand.Play;

public class PlayLearner implements Learner {
    @Override
    public String description() {
        return "Играть";
    }

    @Override
    public void learn(Animal animal) {
        animal.learnCommand(new Play(animal));
    }
}
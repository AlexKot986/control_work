package model.learnerCommands;

import model.animals.Animal;

public interface Learner {
    String description();
    void learn(Animal animal);
}

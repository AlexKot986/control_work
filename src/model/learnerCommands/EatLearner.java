package model.learnerCommands;

import model.animals.Animal;
import model.petsCommand.Eat;

public class EatLearner implements Learner {
    @Override
    public String description() {
        return "Кушать";
    }

    @Override
    public void learn(Animal animal) {
        animal.learnCommand(new Eat(animal));
    }
}

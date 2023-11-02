package model;

import model.Animal;

public interface Command {
    String description();
    void execute(Animal animal);
}

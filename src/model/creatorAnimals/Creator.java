package model.creatorAnimals;

import model.animals.Animal;

public interface Creator {
    String description();
    Animal create(String name, String date);
}

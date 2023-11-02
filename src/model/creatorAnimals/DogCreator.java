package model.creatorAnimals;

import model.animals.Animal;
import model.animals.Dog;

public class DogCreator implements Creator {
    @Override
    public String description() {
        return "Собака";
    }

    @Override
    public Animal create(String name, String date) {
        return new Dog(name, date);
    }
}

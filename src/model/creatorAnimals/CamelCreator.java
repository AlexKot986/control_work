package model.creatorAnimals;

import model.animals.Animal;
import model.animals.Camel;

public class CamelCreator implements Creator {
    @Override
    public String description() {
        return "Верблюд";
    }

    @Override
    public Animal create(String name, String date) {
        return new Camel(name, date);
    }
}

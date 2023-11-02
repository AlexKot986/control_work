package model.creatorAnimals;

import model.animals.Animal;
import model.animals.Horse;

public class HorseCreator implements Creator {
    @Override
    public String description() {
        return "Лошадь";
    }

    @Override
    public Animal create(String name, String date) {
        return new Horse(name, date);
    }
}

package model.creatorAnimals;

import model.animals.Animal;
import model.animals.Hamster;

public class HamsterCreator implements Creator {
    @Override
    public String description() {
        return "Хомяк";
    }

    @Override
    public Animal create(String name, String date) {
        return new Hamster(name, date);
    }
}

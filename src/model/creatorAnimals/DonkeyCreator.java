package model.creatorAnimals;

import model.animals.Animal;
import model.animals.Donkey;

public class DonkeyCreator implements Creator {
    @Override
    public String description() {
        return "Осел";
    }

    @Override
    public Animal create(String name, String date) {
        return new Donkey(name, date);
    }
}
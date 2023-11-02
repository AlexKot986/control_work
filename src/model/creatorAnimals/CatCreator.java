package model.creatorAnimals;

import model.animals.Animal;
import model.animals.Cat;

public class CatCreator implements Creator {

    @Override
    public String description() {
        return "Кошка";
    }

    @Override
    public Animal create(String name, String date) {
        return new Cat(name, date);
    }
}

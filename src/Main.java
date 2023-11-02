import model.AnimalNursery;
import model.animals.*;
import model.creatorAnimals.ListOfCreators;
import model.learnerCommands.ListOfLearners;
import model.petsCommand.*;
import presenter.Presenter;
import view.UserUI;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        AnimalNursery animalNursery1 = new AnimalNursery();
        createListOfAnimals1(animalNursery1);
        Presenter presenter1 = new Presenter(animalNursery1, new ListOfCreators(), new ListOfLearners());
        UserUI user1 = new UserUI(presenter1);

        user1.start();

    }

    public static void createListOfAnimals1(AnimalNursery animalNursery) {

        Hamster hamster = new Hamster("Lola", "2020.02.10");
        hamster.learnCommand(new Eat(hamster));
        hamster.learnCommand(new Bite(hamster));
        animalNursery.addAnimal(hamster);

        Horse horse = new Horse("Holka", "2016.12.15");
        horse.learnCommand(new Walk(horse));
        animalNursery.addAnimal(horse);

        Dog dog = new Dog("Jgut", "2021.01.26");
        dog.learnCommand(new Eat(dog));
        dog.learnCommand(new Bite(dog));
        dog.learnCommand(new Sit(dog));
        animalNursery.addAnimal(dog);

        Donkey donkey = new Donkey("Rocket", "2016.10.31");
        donkey.learnCommand(new Carry(donkey));
        animalNursery.addAnimal(donkey);

        animalNursery.addAnimal(new Camel("Boat", "2019.07.06"));

        Cat cat = new Cat("Pushok", "2020.12.13");
        cat.learnCommand(new Play(cat));
        cat.learnCommand(new Eat(cat));
        animalNursery.addAnimal(cat);

        Hamster hamster1 = new Hamster("Killa", "2022.04.25");
        hamster1.learnCommand(new Walk(hamster1));
        animalNursery.addAnimal(hamster1);

    }
}
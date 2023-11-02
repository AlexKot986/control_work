package presenter;

import model.AnimalNursery;
import model.animals.*;
import model.creatorAnimals.Creator;
import model.creatorAnimals.ListOfCreators;
import model.learnerCommands.Learner;
import model.learnerCommands.ListOfLearners;
import model.petsCommand.*;

import java.util.ArrayList;
import java.util.List;

public class Presenter {

    private AnimalNursery animalNursery;
    private ListOfCreators listOfCreators;
    private ListOfLearners listOfLearners;

    public Presenter(AnimalNursery animalNursery, ListOfCreators listOfCreators,ListOfLearners listOfLearners) {
        this.animalNursery = animalNursery;
        this.listOfCreators = listOfCreators;
        this.listOfLearners = listOfLearners;
    }

    public String getAnimals() {
        StringBuilder sb = new StringBuilder();
        sb.append("Животных в питомнике: " + animalNursery.getCounter());
        sb.append("\n");
        for (Animal animal : animalNursery.getListOfAnimals()) {
            sb.append(animal);
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean isCommandContains(String name, Integer id) {
        Animal animal = findAnimal(name);
        List<String> petCommands = new ArrayList<>();
        for (Command command : animal.getCommands())
            petCommands.add(command.description());
        return petCommands.contains(listOfLearners.getLearnerList().get(id - 1).description());
    }

    public void learnCommand(String name, Integer choice) {
        Animal animal = findAnimal(name);
        listOfLearners.getLearnerList().get(choice - 1).learn(animal);
    }
    private Animal findAnimal(String name) {
        for (Animal animal : animalNursery.getListOfAnimals()) {
            if (name.equals(animal.getName())) {
                return animal;
            }
        }
        return null;
    }

    public Boolean doCommandsExist(String name) {
        Animal animal = findAnimal(name);
        return animal.getCommands().size() == 0;
    }

    public String showCommands(String name) {
        Animal animal = findAnimal(name);
        if (animal.getCommands().size() == 0)
            return animal.getClass().getSimpleName() + " " + animal.getName() + " команд не знает\n";
        int id = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(animal.getClass().getSimpleName() + " " + animal.getName() + " знает команды:\n");
        for (Command command : animal.getCommands()) {
            stringBuilder.append(++id + ". ");
            stringBuilder.append(command.description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public Boolean executeCommand(String name, Integer choice) {
        if (choice == 0) return true;
        Animal animal = findAnimal(name);
        try {
            animal.getCommands().get(choice - 1).execute();
            return true;
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            return false;
        }
    }

    public String showAllCommands() {
        int id = 0;
        StringBuilder sb = new StringBuilder();
        for (Learner learner : listOfLearners.getLearnerList()) {
            sb.append(++id);
            sb.append(". " + learner.description());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String getListOfType() {
        int id = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (Creator creator : listOfCreators.getCreators()) {
            stringBuilder.append(++id + ". ");
            stringBuilder.append(creator.description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void addAnimal(Integer id, String name, String date) {
        Animal animal = listOfCreators.getCreators().get(id - 1).create(name, date);
        animalNursery.addAnimal(animal);
    }

    public Boolean isAnimalExist(String name) {
        return findAnimal(name) != null;
    }
}






















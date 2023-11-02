import java.util.ArrayList;
import java.util.List;

public class AnimalNursery {
    private int counter = 0;
    private List<Animal> listOfAnimals;

    public AnimalNursery() {
        listOfAnimals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        listOfAnimals.add(animal);
        counter++;
    }
}

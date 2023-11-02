package model.creatorAnimals;

import java.util.ArrayList;
import java.util.List;

public class ListOfCreators {
    private List<Creator> creators;

    public ListOfCreators() {
        creators = new ArrayList<>();
        creators.add(new CatCreator());
        creators.add(new DogCreator());
        creators.add(new HamsterCreator());
        creators.add(new HorseCreator());
        creators.add(new DonkeyCreator());
        creators.add(new CamelCreator());
    }
    public List<Creator> getCreators() {
        return creators;
    }
}

package model.learnerCommands;

import java.util.ArrayList;
import java.util.List;

public class ListOfLearners {
    private List<Learner> learnerList;

    public ListOfLearners() {
        learnerList = new ArrayList<>();
        learnerList.add(new EatLearner());
        learnerList.add(new PlayLearner());
        learnerList.add(new WalkLearner());
        learnerList.add(new SitLearner());
        learnerList.add(new CarryLearner());
        learnerList.add(new BiteLearner());
    }

    public List<Learner> getLearnerList() {
        return learnerList;
    }
}

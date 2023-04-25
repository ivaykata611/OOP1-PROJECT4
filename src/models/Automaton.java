package models;

import java.util.List;
import java.util.Set;

public class Automaton {
    private final int id;

    private Set<String> states;
    private List<Transition> transitions;

    public Automaton(int id, List<Transition> transitions) {
        this.id = id;
        this.transitions = transitions;
    }

    public int getId() {
        return id;
    }

    public List<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(List<Transition> transitions) {
        this.transitions = transitions;
    }

}

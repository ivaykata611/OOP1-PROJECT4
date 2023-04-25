package models;

public class Transition {
     private char nameOfTransition;
     private String startState;
     private String endState;

     public Transition(char nameOfTransition, String startState, String endState) {
          this.nameOfTransition = nameOfTransition;
          this.startState = startState;
          this.endState = endState;
     }

     public char getNameOfTransition() {
          return nameOfTransition;
     }

     public void setNameOfTransition(char nameOfTransition) {
          this.nameOfTransition = nameOfTransition;
     }

     public String getStartState() {
          return startState;
     }

     public void setStartState(String startState) {
          this.startState = startState;
     }

     public String getEndState() {
          return endState;
     }

     public void setEndState(String endState) {
          this.endState = endState;
     }

     @Override
     public String toString() {
          return getStartState()+"->"+getNameOfTransition()+"->"+getEndState();
     }

}

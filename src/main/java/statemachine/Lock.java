package statemachine;

import statemachine.states.*;

import java.util.LinkedList;

/**
 * Created by budi on 15/01/15.
 */
public class Lock implements StateMachine {

    //TODO Declarar estados aqui.

    State currentState;
    LinkedList<String> list;

    public Lock() {
        // Instanciar estados aqui.

        list = new LinkedList<String>();
        list.add("Locked");
        //TODO currentState = /*Asignar el primer estado*/;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    //TODO Getters de estados, si los hiciste privados.

    //TODO Actions
    public void ActionX() {
        //TODO ... Hacer cositas aqui
        this.list.add(this.currentState.getMessage());
    }

    public LinkedList<String> getList() {
        return list;
    }
}

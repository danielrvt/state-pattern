package statemachine;

import statemachine.states.*;

import java.util.LinkedList;

/**
 * Created by budi on 15/01/15.
 */
public class Lock {

    State locked;
    State numberOneOk;
    State numberTwoOk;
    State numberThreeOk;
    State numberFourOk;
    State opened;

    State currentState;
    LinkedList<String> list;

    public Lock() {
        locked = new Opened(this);
        numberOneOk = new NumberOneOk(this);
        numberTwoOk = new NumberTwoOk(this);
        numberThreeOk = new NumberThreeOk(this);
        numberFourOk = new NumberFourOk(this);
        opened = new Opened(this);

        list.add("Locked");

        currentState = locked;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.list.add(this.currentState.getMessage());
    }

    public State getLocked() {
        return locked;
    }

    public State getNumberOneOk() {
        return numberOneOk;
    }

    public State getNumberTwoOk() {
        return numberTwoOk;
    }

    public State getNumberThreeOk() {
        return numberThreeOk;
    }

    public State getNumberFourOk() {
        return numberFourOk;
    }

    public State getOpened() {
        return opened;
    }

    // Actions

    public void lock() {
        currentState.lock();
    }

    public void inputNumberOne(int n) {
        currentState.inputNumberOne(n);
    }

    public void inputNumberTwo(int n) {
        currentState.inputNumberTwo(n);
    }

    public void inputNumberThree(int n) {
        currentState.inputNumberThree(n);
    }

    public void inputNumberFour(int n) {
        currentState.inputNumberFourk(n);
    }

    public void open() {
        currentState.open();
    }
}

package statemachine;

import statemachine.states.*;

import java.util.LinkedList;

/**
 * Created by budi on 15/01/15.
 */
public class Lock implements StateMachine {

    private State locked;
    private State numberOneOk;
    private State numberTwoOk;
    private State numberThreeOk;
    private State numberFourOk;
    private State opened;

    State currentState;
    LinkedList<String> list;

    public Lock() {
        locked = new Locked(this);
        numberOneOk = new NumberOneOk(this);
        numberTwoOk = new NumberTwoOk(this);
        numberThreeOk = new NumberThreeOk(this);
        numberFourOk = new NumberFourOk(this);
        opened = new Opened(this);

        list = new LinkedList<String>();
        list.add("Locked");
        currentState = locked;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
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
        this.list.add(this.currentState.getMessage());
    }

    public void inputNumberOne(int n) {
        currentState.inputNumberOne(n);
        this.list.add(this.currentState.getMessage());
    }

    public void inputNumberTwo(int n) {
        currentState.inputNumberTwo(n);
        this.list.add(this.currentState.getMessage());
    }

    public void inputNumberThree(int n) {
        currentState.inputNumberThree(n);
        this.list.add(this.currentState.getMessage());
    }

    public void inputNumberFour(int n) {
        currentState.inputNumberFourk(n);
        this.list.add(this.currentState.getMessage());
    }

    public void open() {
        currentState.open();
        this.list.add(this.currentState.getMessage());
    }

    public LinkedList<String> getList() {
        return list;
    }
}

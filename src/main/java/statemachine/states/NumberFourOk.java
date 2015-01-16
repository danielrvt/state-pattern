package statemachine.states;

import statemachine.Lock;

/**
 * Created by budi on 15/01/15.
 */
public class NumberFourOk implements State {
    Lock lock;
    String message;

    public NumberFourOk(Lock lock) {
        this.lock = lock;
        this.message = "You've entered the last number right!";
    }

    @Override
    public void lock() {
        this.lock.setCurrentState(this.lock.getLocked());
        this.message = "Lock closed from state four!";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberOne(int n) {
        this.message = "You shouldn't enter numbers in that position...";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberTwo(int n) {
        this.message = "You shouldn't enter numbers in that position...";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberThree(int n) {
        this.message = "You shouldn't enter numbers in that position...";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberFourk(int n) {
        this.message = "You shouldn't enter numbers in that position...";
        System.out.println(this.message);
    }

    @Override
    public void open() {
        this.lock.setCurrentState(this.lock.getOpened());
        this.message = "Yei! You did it!";
        System.out.println(this.message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}

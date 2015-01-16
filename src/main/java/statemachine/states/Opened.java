package statemachine.states;

import statemachine.Lock;

/**
 * Created by budi on 15/01/15.
 */
public class Opened implements State {
    Lock lock;
    String message;

    public Opened(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void lock() {
        this.lock.setCurrentState(this.lock.getLocked());
        this.message = "Lock closed from open lock!";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberOne(int n) {
        this.lock.setCurrentState(this.lock.getLocked());
        this.message = "Lock closed from open one!";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberTwo(int n) {
        this.lock.setCurrentState(this.lock.getLocked());
        this.message = "Lock closed from open two!";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberThree(int n) {
        this.lock.setCurrentState(this.lock.getLocked());
        this.message = "Lock closed! from open three";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberFourk(int n) {
        this.lock.setCurrentState(this.lock.getLocked());
        this.message = "Lock closed! from open fourk";
        System.out.println(this.message);
    }

    @Override
    public void open() {
        this.message = "Already opened!";
        System.out.println(this.message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}

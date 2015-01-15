package statemachine.states;

import statemachine.Lock;

/**
 * Created by budi on 15/01/15.
 */
public class Locked implements State {

    Lock lock;
    String message;

    public Locked(Lock lock) {
        this.lock = lock;
        this.message = "I'm locked";
    }

    @Override
    public void lock() {
        this.message = "I'm already locked, wtf?";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberOne(int n) {
        if (n == 14) {
            lock.setCurrentState(lock.getNumberOneOk());
            this.message = "Yei! You got the first number right.";
            System.out.println(this.message);
        }
        this.message = "You got the first number wrong.";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberTwo(int n) {
        this.message = "Can't input this yet... F-you";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberThree(int n) {
        this.message = "Can't input this yet... F-you";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberFourk(int n) {
        this.message = "Can't input this yet... F-you";
        System.out.println(this.message);
    }

    @Override
    public void open() {
        this.message = "I'm locked mothafockaaaa! Get your combination right";
        System.out.println(this.message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}

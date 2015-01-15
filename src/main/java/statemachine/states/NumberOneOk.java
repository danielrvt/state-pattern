package statemachine.states;

import statemachine.Lock;

/**
 * Created by budi on 15/01/15.
 */
public class NumberOneOk implements  State{
    Lock lock;
    String message;

    public NumberOneOk(Lock lock) {
        this.lock = lock;
        this.message = "You've enter the first number right";
    }

    @Override
    public void lock() {
        this.lock.setCurrentState(this.lock.getLocked());
        this.message = "Lock closed!";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberOne(int n) {
        this.message = "You shouldn't enter numbers in that position...";
        System.out.println(this.message);
    }

    @Override
    public void inputNumberTwo(int n) {
        if (n == 7) {
            this.lock.setCurrentState(this.lock.getNumberTwoOk());
            this.message = "Second number was entered right";
        } else {
            this.message = "You've got it wrong...";
        }

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
        this.message = "You can't open the lock yet";
        System.out.println(this.message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}

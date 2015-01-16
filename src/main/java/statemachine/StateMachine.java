package statemachine;

import java.util.LinkedList;

public class StateMachine {

    private final LinkedList<String> messages;
    private final Lock lock;

    public StateMachine(long id, String content) {
        this.lock = new Lock();

        this.messages = new LinkedList<String>();
        this.messages.add(this.lock.getCurrentState().getMessage());
    }

    public LinkedList<String> getMessages() {
        return this.messages;
    }
}

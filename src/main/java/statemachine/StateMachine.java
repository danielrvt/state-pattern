package statemachine;

public class StateMachine {

    private final long id;
    private final String content;
    private final int number;
    private final Lock lock;

    public StateMachine(long id, String content) {
        this.id = id;
        this.content = content;
        this.number = 2;
        this.lock = new Lock();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getNumber() {
        return number;
    }

    public Lock getLock() {
        return lock;
    }
}

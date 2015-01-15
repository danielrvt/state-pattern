package statemachine;

public class StateMachine {

    private final long id;
    private final String content;
    private final int number;

    public StateMachine(long id, String content) {
        this.id = id;
        this.content = content;
        this.number = 2;
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

}

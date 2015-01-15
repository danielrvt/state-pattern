package statemachine.states;

/**
 * Created by budi on 15/01/15.
 * <p/>
 */
public interface State {

    public void lock();

    public void   inputNumberOne(int n);

    public void   inputNumberTwo(int n);

    public void inputNumberThree(int n);

    public void   inputNumberFourk(int n);

    public void open();

    public String getMessage();
}

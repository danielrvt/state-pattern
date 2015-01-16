package statemachine;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StateMachineController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private static Lock lock = new Lock();

    @RequestMapping("/state-machine/one")
    public LinkedList<String> enterFirst(@RequestParam(value = "number", defaultValue = "-1") int number) {
        lock.inputNumberOne(number);
        return lock.list;
    }

    @RequestMapping("/state-machine/two")
    public LinkedList<String> enterSecond(@RequestParam(value = "number", defaultValue = "-1") int number) {
        lock.inputNumberTwo(number);
        return lock.list;
    }
    @RequestMapping("/state-machine/three")
    public LinkedList<String> enterThird(@RequestParam(value = "number", defaultValue = "-1") int number) {
        lock.inputNumberThree(number);
        return lock.list;
    }
    @RequestMapping("/state-machine/four")
    public LinkedList<String> enterFourth(@RequestParam(value = "number", defaultValue = "-1") int number) {
        lock.inputNumberFour(number);
        return lock.list;
    }

    @RequestMapping("/state-machine/open")
    public boolean open() {
        if (lock.getCurrentState() == lock.getNumberFourOk()) {
            lock.open();
            return true;
        }
        else return false;
    }

    @RequestMapping("/state-machine/close")
    public LinkedList<String> close(@RequestParam(value = "number", defaultValue = "-1") int number) {
        lock.lock();
        return lock.list;
    }
}

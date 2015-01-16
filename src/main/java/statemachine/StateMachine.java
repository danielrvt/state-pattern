package statemachine;

import statemachine.states.State;

import java.util.LinkedList;

/**
 * Created by budi on 15/01/15.
 */
public interface StateMachine {

    /**
     * Este metodo es importante para los
     * estados de la caja fuerte.
     *
     * @return el estado actual
     */
    public State getCurrentState();

    /**
     * Esta lista se llena con cada acción sobre la clase Lock. Por ejemplo
     * si se introduce el primer número, la lista contendrá el resultado
     * de la acción: Número 1 introducido correctamente o Número 1 introducido
     * de forma incorrecta.
     *
     * Esto es importante para que los webservices retornen la lista de eventos
     * sobre la caja fuerte en el orden que ocurrieron.
     *
     * @return Una lista de mensajes (Eventos) sobre la
     * caja fuerte.
     */
    public LinkedList<String> getList();
}

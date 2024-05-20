package co.com.hyunseda.order.domain.entity;

/**
 * @class embarkedState
 * @brief Representa el estado "Embarcado" de una orden en el sistema.
 * @details Esta clase extiende de la clase State y define el comportamiento específico
 * del estado "Embarcado".
 */
public class embarkedState extends State {
    /**
     * @brief Constructor que referencia a la clase padre
     * @param order
     * @details recibe el estado de la orden
     */
    public embarkedState(Order order) {
        super(order);
    }

    /**
     * @brief Constructor que referencia a la clase padre
     * @param changeState
     * @detail es para cambiar de estado de la orden
     */
    public embarkedState(State changeState){super(changeState);}

    public State next(){return this;}

    public State cancel(){return this;}

}

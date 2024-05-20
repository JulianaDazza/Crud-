package co.com.hyunseda.order.domain.entity;


/**
 * @class sentState
 * @brief Representa el estado de un pedido cuando ha sido enviado.
 * @details Esta clase hereda de OrderState y define el comportamiento específico para el estado "Enviado".
 */

public class sentState extends  State{

    /**
     * Contexto de la orden
     * @param order
     */
    public sentState(Order order) {
        super(order);
    }

    /**
     * @brief Referencia al constructor de la clase padre
     * @param changeState
     */
    public sentState(State changeState){super(changeState);}
}

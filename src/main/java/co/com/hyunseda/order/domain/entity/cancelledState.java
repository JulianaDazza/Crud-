package co.com.hyunseda.order.domain.entity;

import lombok.RequiredArgsConstructor;

/**
 * @class cancelledState
 * @brief Representa el estado "Cancelado" de una orden.
 * @details Este estado indica que la orden ha sido cancelada por el usuario.
 */

public class cancelledState extends State{
    /**
     * @brief Constructor que referencia a la clase padre
     * @param order
     */
    public cancelledState(Order order){super(order);}

    /**
     * @brief Constructor que referencia a la clase padre
     * @param changeState
     */
    public cancelledState(State changeState){super(changeState);}

    /**
     * @brief Indica que la orden ha sido cancelada
     * @return this, no hay un estado posterior
     */
    public State cancel()
    {
        System.out.println("Pedido Cancelado con éxito");
        return  this;
    }
}

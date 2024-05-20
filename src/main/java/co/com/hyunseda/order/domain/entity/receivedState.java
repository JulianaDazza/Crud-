package co.com.hyunseda.order.domain.entity;

import lombok.RequiredArgsConstructor;
/**
 * @class receivedState
 * @brief Clase que representa el estado de "Recibido" de una orden.
 * Extiende de OrderState.
 * @detailss Es el estado final, por una ruta exitosa
 */

public class receivedState extends State{
    /**
     * @brief Referencia al constructor de la clase padre
     * @param order
     */
    public receivedState(Order order) {
        super(order);
    }
    /**
     * @brief Referencia al constructor de la clase padre
     * @param changeState
     */
    public receivedState(State changeState){super(changeState);}

    public State next(){return this;}/**Es el estado final, en caso correcto*/

}

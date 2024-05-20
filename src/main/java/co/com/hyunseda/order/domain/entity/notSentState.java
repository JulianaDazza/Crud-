package co.com.hyunseda.order.domain.entity;
/**
 * @class notSentState
 * @brief Representa el estado "No enviado" de una orden.
 * @details Estado inicial de la orden.
 */


public class notSentState extends  State{

    /**
     * @brief Referencia al constructor de la clase padre
     * @param orderState
     */
    public notSentState(Order orderState) {
        super(orderState);}

    /**
     * @brief Referencia al constructor de la clase padre
     * @param changeState
     */
    public notSentState(State changeState){super(changeState);}

    /**
     * @brief función para cambiar de estado
     * @return This
     */
    public State next(){return this;}

    /**
     * @brief función para cancelar pedido
     * @return this
     */
    public State cancel(){return this;}
}

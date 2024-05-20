package co.com.hyunseda.order.domain.entity;

public class processedState extends State{
    /**
     * @brief Referencia al constructor de la clase padre
     * @param order
     */
    public processedState(Order order) {
        super(order);
    }
    /**
     * @brief Referencia al constructor de la clase padre
     * @param changeState
     */
    public processedState(State changeState) {
        super(changeState);
    }
}

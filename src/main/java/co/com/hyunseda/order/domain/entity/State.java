package co.com.hyunseda.order.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

/**
 * @Class Define el comportamiento de las órdenes
 *
 */

@Data
@Entity@Table(name = "StateTable")
public class State implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stateId;

    @OneToOne
    private Order context; /**<! Contexto de la orden*/

    /**
     * @brief Constructor parametrizado de la orden
     * @param order
     */
    public State(Order order){setContext(order);}

    /**
     * @brief Constructor parametrizado cambiando el estado
     * @param newState
     */
    public State(State newState){setContext(newState.getContext());}
    /**Crea un modelo para cambiar de estado*/
    public State transitionState(){return  null;}
    /**@brief Coloca el estado inicial*/
    public static State InitialState(Order orderState){return new notSentState(orderState);}

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

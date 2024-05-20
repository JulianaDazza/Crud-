package co.com.hyunseda.order.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @class Order
 * @brief Represents an order entity.
 */
@Entity
@Table(name = "OrderTable")@RequiredArgsConstructor@Data
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;/**<! Id de la orden, para guardar un registro*/

    private Date orderDate;/**<! Fecha en la que se efectuó la orden*/

    @OneToOne
    private State state;/**<! Controla el estado de la orden*/

    @JsonIgnore
    @ManyToOne@PrimaryKeyJoinColumn
    Pay objPay;

    @OneToMany
    @JoinColumn(name = "Item_id")
    private List<Item> items = new ArrayList<>();

}

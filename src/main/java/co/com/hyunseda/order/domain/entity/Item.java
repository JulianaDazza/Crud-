package co.com.hyunseda.order.domain.entity;

/**
 * @file Item.java
 * @brief Contiene la definición de la clase Item.
 * @author wpantoja, ahurtado
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

/**
 * @class Item
 * @brief Representa un ítem de una orden de compra o una factura.
 */
@Data
@RequiredArgsConstructor
@Entity@Table(name = "items")
public class Item implements Serializable {
    /**
     * @brief Identificador único del ítem.
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Item_id")
    private Long itemId;

    /**
     * @brief Orden a la que pertenece el ítem.
     */
    private Long orderId;

    /**
     * @brief Cantidad del producto en el ítem.
     */
    private Integer amount;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Product product;/**<! Producto relacionado con Item*/

    public Item(Product p, Integer amount) {
        this.product = p;
        this.amount = amount;
    }

}

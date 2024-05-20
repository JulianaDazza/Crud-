package co.com.hyunseda.order.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;/*<! Id del producto, es único y obligatorio*/
    private String productName;/*<!Nombre del producto, es obligatorio*/
    private String productDescription;/*<!Nombre del producto, es obligatorio*/
    private Double productPrice;/*<!Precio del producto*/
    private Double productStock;/*<!Cantidad del producto*/
}

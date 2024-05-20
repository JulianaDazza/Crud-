package co.com.hyunseda.order.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "paytable")
public class Pay implements Serializable {
    private static final long serialVersionUID = 1L;//se utiliza para garantizar la compatibilidad entre diferentes
    // versiones de la clase cuando se serializa y deserializa.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pay_Id")
    private Long payId;

    @Column(name = "account")
    private int numAccount;

/*
    @OneToMany(mappedBy = "objPay")
    @PrimaryKeyJoinColumn
    private List<Order> orderList;/**<! Recibe la orden*/

    public boolean doPay(int prmAccount){
        return false;
    }




}

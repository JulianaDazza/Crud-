package co.com.hyunseda.market.service;

import co.com.hyunseda.market.domain.Carrito;
import co.com.hyunseda.market.domain.Product;
import co.com.hyunseda.market.infra.Subject;
import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author JUAN DAVID
 */
public class CarritoService extends Subject{
    private Carrito carrito;
    
    public CarritoService( ArrayList<Product> listaP, int total){
        carrito = new Carrito(listaP,total);
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
        this.notifyAllObserves();
    }
    
}

package co.com.hyunseda.market.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JUAN DAVID
 */
public class Carrito {
    
    List <Product> productos = new ArrayList();
    int totalArticulos;

    public Carrito(List <Product> productos, int totalArticulos) {
        this.productos = productos;
        this.totalArticulos = totalArticulos;
    }

    public List<Product> getProductos() {
        return productos;
    }

    public void setProductos(List<Product> productos) {
        this.productos = productos;
    }

    public int getTotalArticulos() {
        return totalArticulos;
    }

    public void setTotalArticulos(int totalArticulos) {
        this.totalArticulos = totalArticulos;
    }
    
    
}

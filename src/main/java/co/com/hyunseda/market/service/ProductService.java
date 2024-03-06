package co.com.hyunseda.market.service;


import co.com.hyunseda.market.domain.Category;
import co.com.hyunseda.market.domain.Product;
import co.com.hyunseda.market.domain.access.ICategoryRepository;
import co.com.hyunseda.market.domain.access.IProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
public class ProductService {

    private final IProductRepository productR;
    
    public ProductService(IProductRepository productR) {
        this.productR = productR;
    }
    
  
    public boolean saveProduct(String name, String description, double price) {
          
        Product newProduct = new Product();
        newProduct.setName(name);
        newProduct.setDescription(description);
        newProduct.setPrice(price);
        
        //Validate product
        if (newProduct.getName().isEmpty() || newProduct.getDescription().isEmpty() || newProduct.getPrice() <= 0) {
            return false;
        }

        return productR.save(newProduct);

    }
    public List<Product> listProducts() {
        List<Product> products = new ArrayList<>();
        products = productR.list();

        return products;
    }

    public List<Product> findAllProducts() {
        return productR.list();
    }
    
    public Product findProductById(Long id){
        return productR.findById(id);
    }
    
    public List<Product> findProductsByName(Long name) {
        return (List<Product>) productR.findByName(name);
    }
    
    public Product findPorName(String atrName)
    {
        return productR.findPorName(atrName);
    }
      
    public boolean deleteProduct(Long id){
        return productR.delete(id);
    }

    public boolean editProduct(Long productId, Product prod) {
        
        //Validate product
        if (prod == null || prod.getName().isEmpty() ) {
            return false;
        }
        return productR.edit(productId, prod);
    }

}

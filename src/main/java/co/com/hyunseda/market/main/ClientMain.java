package co.com.hyunseda.market.main;

import co.com.hyunseda.market.domain.Product;
import co.com.hyunseda.market.domain.access.Factory;
import co.com.hyunseda.market.presentation.GUIAddProduct;
import co.com.hyunseda.market.service.ProductService;
import co.com.hyunseda.market.domain.access.SQLiteCategoryRepository;
import co.com.hyunseda.market.domain.access.SQLiteProductRepository;
import co.com.hyunseda.market.domain.access.IProductRepository;
import co.com.hyunseda.market.domain.access.ICategoryRepository;
import co.com.hyunseda.market.presentation.GUIMainMenu;
import co.com.hyunseda.market.presentation.GUIUserMen;
import co.com.hyunseda.market.service.CategoryService;

/**
 *
 * @author Libardo Pantoja
 */
public class ClientMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Le decimos a la fábrica que nos de el repositorio por defecto
        IProductRepository productR = Factory.getInstance().getProductRepository("sqlite");
        ICategoryRepository categoryR = Factory.getInstance().getCategoryRepository("sqlite");
        ProductService productS = new ProductService(productR);
        CategoryService categoryS = new CategoryService(categoryR);

        GUIUserMen userForm = new GUIUserMen(productS,categoryS);
        userForm.setVisible(true);
        //GUIMainMenu menuForm = new GUIMainMenu(productS,categoryS);
        //menuForm.setVisible(true);
        
        /*Product newProduct = new Product(1, "Product One", 10d);
        service.saveProduct(newProduct);

        newProduct = new Product(2, "Product Two", 50);
        service.saveProduct(newProduct);

        for (Product p : service.listProducts()) {
            System.out.println(p);
        }*/
          
        
    }
    
}

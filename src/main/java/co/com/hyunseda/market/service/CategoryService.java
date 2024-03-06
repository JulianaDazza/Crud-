/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.hyunseda.market.service;

import co.com.hyunseda.market.domain.Category;
import co.com.hyunseda.market.domain.Product;
import co.com.hyunseda.market.domain.access.ICategoryRepository;
import co.com.hyunseda.market.domain.access.IProductRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JUAN DAVID
 */
public class CategoryService {
    //private Connection conn;
    private final ICategoryRepository categoryR;
    //private final IDataBaseInitializer databaseInitializer;
    
    public CategoryService(ICategoryRepository categoryR) {
        //this.conn = conn;
        this.categoryR = categoryR;
    }
    
    public boolean saveCategory(String categoryName) {
      Category category = new Category();
      category.setName(categoryName);
      return categoryR.save(category);
    }
    public List<Category> findAllCategories() {
        return categoryR.list();
    }
    
    public boolean editCategory(Long categoryId, Category cat) {
        
        //Validate product
        if (cat == null || cat.getName().isEmpty() ) {
            return false;
        }
        return categoryR.edit(categoryId, cat);
    }
    
    public boolean deleteCategory(Long id){
        return categoryR.delete(id);
    }
    
    public Product findCategoryById(Long id){
        return categoryR.findById(id);
    }
    
    public List<Product> findCategoryByName(Long name) {
        return (List<Product>) categoryR.findByName(name);
    }
}

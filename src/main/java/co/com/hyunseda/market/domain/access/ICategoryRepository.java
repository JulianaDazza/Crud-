package co.com.hyunseda.market.domain.access;

import co.com.hyunseda.market.domain.Category;
import co.com.hyunseda.market.domain.Product;

import java.util.List;

/**
 *
 * @author JUAN DAVID
 */
public interface ICategoryRepository {
    boolean save(Category category);
    List<Category> list();
    boolean edit(long categoryId, Category category);
    boolean delete(Long categoryId);
    Product findById(Long categoryId);
    Product findByName(Long categoryName);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.hyunseda.market.domain.access;

/**
 *
 * @author JUAN DAVID
 */
public class Factory {
    private static Factory instance;

    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia IProductRepository
     *
     * @param type cadena que indica qué tipo de clase hija debe instanciar
     * @return una clase hija de la abstracción IProductRepository
     */
    public IProductRepository getProductRepository(String type) {

        IProductRepository result = null;

        switch (type) {
            case "sqlite":
                result = new SQLiteProductRepository();
                break;
        }

        return result;

    }
    /**
     * Método que crea una instancia concreta de la jerarquia ICategoryRepository
     *
     * @param type cadena que indica qué tipo de clase hija debe instanciar
     * @return una clase hija de la abstracción ICategoryRepository
     */
    public ICategoryRepository getCategoryRepository(String type) {

        ICategoryRepository result = null;

        switch (type) {
            case "sqlite":
                result = new SQLiteCategoryRepository();
                break;
        }

        return result;

    }
}

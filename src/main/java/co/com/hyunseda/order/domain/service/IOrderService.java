package co.com.hyunseda.order.domain.service;

import co.com.hyunseda.order.domain.entity.Item;
import co.com.hyunseda.order.domain.entity.Order;
import co.com.hyunseda.order.domain.entity.Product;

import java.util.List;

public interface IOrderService {
    /**
     * Busca y retorna todos los ítems existentes
     * @return Lista de Ordenes
     */
    public List<Order> findAll();
    /**
     * Busca y retorna un Order por su identificador único.
     * @param id El identificador único de la Order a buscar
     * @param amount Cantidad de productos
     * @return La Order encontrada, o un valor vacío si no se encuentra ningún Order con el ID proporcionado
     */
    public Order findById(Long id, Integer amount);
    /**
     * Crea un nueva Order.
     * @param item La Order a ser creada
     * @return La Order creada
     */
    public Item create(Item item);
    /**
     * Actualiza un Order existente.
     * @param item La Order con los datos actualizados
     * @param id El identificador único de la Order a actualizar
     * @return La Order actualizada
     */

    public Item update(Item item, Long id);

    /**
     * Elimina un Order por su identificador único.
     * @param id El identificador único de la Order a eliminar
     */
    public void delete(Long id);
}

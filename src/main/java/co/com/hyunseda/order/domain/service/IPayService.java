package co.com.hyunseda.order.domain.service;

import co.com.hyunseda.order.domain.entity.Pay;

import java.util.List;
import java.util.Optional;

public interface IPayService {
    /**
     * Busca todos los pagos
     * @return Lista de pagos
     */
    public List<Pay> findAll();
    /**
     * @param id Id del pago
     * @return Una pago, que concuerde con el ID ingresado
     * @brief
     */
    public Pay findById(Long id);

    /**
     * Crea una pago y lo inserta en la BD
     * @param Pay pago a Crear
     * @return  pago cread
     */
    public Pay create(Pay Pay);

    /**
     * Modifica una pago de la BD
     * @param id Identificador de lpago a crear
     * @param Pay pago con las modificaciones
     * @return pago después de ser actualizado en la BD
     */
    public Pay update(Long id, Pay Pay) ;

    /**
     * Borra un pago dado un Id
     * @param id Identificador del pago
     */
    public void deleteById(Long id) ;

}

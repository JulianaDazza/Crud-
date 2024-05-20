package co.com.hyunseda.order.domain.dao;

import co.com.hyunseda.order.domain.entity.Pay;
import org.springframework.data.repository.CrudRepository;

public interface IPayDao extends CrudRepository<Pay,Long> {
}

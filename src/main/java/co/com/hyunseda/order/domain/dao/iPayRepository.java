package co.com.hyunseda.order.domain.dao;

import co.com.hyunseda.order.domain.entity.Pay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iPayRepository extends JpaRepository<Pay,Long> {
}

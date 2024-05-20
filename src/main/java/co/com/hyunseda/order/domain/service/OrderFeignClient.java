package co.com.hyunseda.order.domain.service;

import co.com.hyunseda.order.domain.entity.Item;
import co.com.hyunseda.order.domain.entity.Order;
import co.com.hyunseda.order.domain.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderFeignClient implements  IOrderService{
    @Autowired
    private IItemClientFeign ItemFeign;
    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Order findById(Long id, Integer amount) {
        return null;
    }

    @Override
    public Item create(Item item) {
        return null;
    }

    @Override
    public Item update(Item item, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}

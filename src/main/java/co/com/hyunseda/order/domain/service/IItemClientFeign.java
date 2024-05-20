package co.com.hyunseda.order.domain.service;

import co.com.hyunseda.order.domain.entity.Item;
import co.com.hyunseda.order.domain.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(name = "Item-service",url = "localhost:8006")
public interface IItemClientFeign {
    @GetMapping("/items")
    public List<Item> list();

    @GetMapping("/items/{id}")
    public Item detail(@PathVariable Long id);

    @PostMapping("/items/{amount}")
    public Item create(@RequestBody Product product,@PathVariable Integer amount);

    @PostMapping("/items/{id}/{amount}")
    public Item update(@PathVariable Long id, @RequestBody Product product,@PathVariable Integer amount);

    @DeleteMapping("/eliminar/{id}")
    public void delete(@PathVariable Long id);
}











package co.com.hyunseda.order.presentation.rest;

import co.com.hyunseda.order.domain.entity.Pay;
import co.com.hyunseda.order.domain.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pay")
public class PayController {
    @Autowired
    private IPayService payService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody//Va a ser una respuesta JSON
    public List<Pay> findAll() {
        return  (List<Pay>) payService.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Pay findById(@PathVariable Long id){
         Pay pay = payService.findById(id);
        return pay;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Pay create(@RequestBody Pay pay){
        return payService.create(pay);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public Pay update(@RequestBody Pay pay, @PathVariable Long id) {
        return payService.update(id, pay);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = "application/json")
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        payService.deleteById(id);
    }
}

package co.com.hyunseda.order.domain.service;

import co.com.hyunseda.order.domain.dao.IPayDao;
import co.com.hyunseda.order.domain.entity.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PayService implements IPayService {

    @Autowired
    private IPayDao payDao;
    @Override
    @Transactional(readOnly = true)/*<! Método de springframework que sincroniza con la BD*/
    public List<Pay> findAll() {
        return (List<Pay>) payDao.findAll();
    }

    @Override
    public Pay findById(Long id) {
        Pay objPay = payDao.findById(id).orElse(null);
        return objPay;
    }

    @Override
    public Pay create(Pay pay) {
        return payDao.save(pay);
    }

    @Override
    public Pay update(Long id, Pay prmPay) {
        Pay objPay = this.findById(id);
        objPay.setNumAccount(prmPay.getNumAccount());
        return payDao.save(objPay);
    }

    @Override
    public void deleteById(Long id) {
        payDao.deleteById(id);
    }
}

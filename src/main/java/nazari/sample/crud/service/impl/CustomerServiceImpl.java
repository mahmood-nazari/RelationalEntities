package nazari.sample.crud.service.impl;

import nazari.sample.crud.model.datamodel.Customer;
import nazari.sample.crud.model.dto.CustomerDTO;
import nazari.sample.crud.repository.ICustomerDao;
import nazari.sample.crud.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerDao iCustomerDao;

    @Override
    public Customer saveOrUpdate(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public CustomerDTO getById(Long id) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllCar() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

package nazari.sample.crud.service.impl;

import nazari.sample.crud.mapper.ICustomerMapper;
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
        Customer customer = ICustomerMapper.INSTANCE.customerDTOToCustomer(customerDTO);
        return iCustomerDao.save(customer);
    }

    @Override
    public CustomerDTO getById(Long id) {
        return ICustomerMapper.INSTANCE.customerToCustomerDTO(iCustomerDao.findById(id).orElse(null));
    }

    @Override
    public List<CustomerDTO> getAllCar() {
        return ICustomerMapper.INSTANCE.customerToCustomer(iCustomerDao.findAll());
    }

    @Override
    public void deleteById(Long id) {
        iCustomerDao.deleteById(id);
    }
}

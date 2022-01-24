package nazari.sample.crud.service.impl;

import nazari.sample.crud.model.datamodel.CustomerBook;
import nazari.sample.crud.model.dto.CustomerBookDTO;
import nazari.sample.crud.repository.ICustomerBookDao;
import nazari.sample.crud.service.ICustomerBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerBookServiceImpl implements ICustomerBookService {

    @Autowired
    private ICustomerBookDao iCustomerBookDao;

    @Override
    public CustomerBook saveOrUpdate(CustomerBookDTO customerBookDTO) {
        return null;
    }

    @Override
    public CustomerBookDTO getById(Long id) {
        return null;
    }

    @Override
    public List<CustomerBookDTO> getAllCar() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

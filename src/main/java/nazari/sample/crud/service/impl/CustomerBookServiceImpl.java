package nazari.sample.crud.service.impl;

import nazari.sample.crud.mapper.ICustomerBookMapper;
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
        CustomerBook customerBook = ICustomerBookMapper.INSTANCE.bookDTOToBook(customerBookDTO);
        return iCustomerBookDao.save(customerBook);
    }

    @Override
    public CustomerBookDTO getById(Long id) {
        return ICustomerBookMapper.INSTANCE.bookToBookDTO(iCustomerBookDao.findById(id).orElse(null));
    }

    @Override
    public List<CustomerBookDTO> getAllCar() {
        return ICustomerBookMapper.INSTANCE.bookToBookDTO(iCustomerBookDao.findAll());
    }

    @Override
    public void deleteById(Long id) {
        iCustomerBookDao.deleteById(id);
    }
}

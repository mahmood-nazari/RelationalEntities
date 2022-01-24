package nazari.sample.crud.service;

import nazari.sample.crud.model.datamodel.CustomerBook;
import nazari.sample.crud.model.dto.CustomerBookDTO;

import java.util.List;

public interface ICustomerBookService {

    CustomerBook saveOrUpdate(CustomerBookDTO customerBookDTO);

    CustomerBookDTO getById(Long id);

    List<CustomerBookDTO> getAllCar();

    void deleteById(Long id);
}

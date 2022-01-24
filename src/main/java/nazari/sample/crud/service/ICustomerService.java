package nazari.sample.crud.service;

import nazari.sample.crud.model.datamodel.Customer;
import nazari.sample.crud.model.datamodel.CustomerBook;
import nazari.sample.crud.model.dto.CustomerBookDTO;
import nazari.sample.crud.model.dto.CustomerDTO;

import java.util.List;

public interface ICustomerService {

    Customer saveOrUpdate(CustomerDTO customerDTO);

    CustomerDTO getById(Long id);

    List<CustomerDTO> getAllCar();

    void deleteById(Long id);
}

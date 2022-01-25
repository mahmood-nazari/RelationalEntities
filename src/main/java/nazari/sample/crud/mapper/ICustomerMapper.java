package nazari.sample.crud.mapper;

import nazari.sample.crud.model.datamodel.Customer;
import nazari.sample.crud.model.dto.CustomerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ICustomerMapper {

    ICustomerMapper INSTANCE = Mappers.getMapper(ICustomerMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "customerBooks", target = "customerBookDTOS")
    @Mapping(source = "createdDate", target = "createdDate")
    CustomerDTO customerToCustomerDTO(Customer customer);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "customerBookDTOS", target = "customerBooks")
    @Mapping(source = "createdDate", target = "createdDate")
    Customer customerDTOToCustomer(CustomerDTO customerDTO);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "customerBooks", target = "customerBookId")
    @Mapping(source = "createdDate", target = "createdDate")
    List<CustomerDTO> customerToCustomer(List<Customer> customers);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "customerBookId", target = "customerBooks")
    @Mapping(source = "createdDate", target = "createdDate")
    List<Customer> customerDTOToCustomer(List<CustomerDTO> customerDTOS);
}

package nazari.sample.crud.mapper;

import nazari.sample.crud.model.datamodel.CustomerBook;
import nazari.sample.crud.model.dto.CustomerBookDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ICustomerBookMapper {

    ICustomerBookMapper INSTANCE = Mappers.getMapper(ICustomerBookMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "createdDate", target = "createdDate")
    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "book.id", target = "bookId")
    CustomerBookDTO bookToBookDTO(CustomerBook customerBook);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "createdDate", target = "createdDate")
    @Mapping(source = "customerId", target = "customer.id")
    @Mapping(source = "bookId", target = "book.id")
    CustomerBook bookDTOToBook(CustomerBookDTO customerBookDTO);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "createdDate", target = "createdDate")
    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "book.id", target = "bookId")
    List<CustomerBookDTO> bookToBookDTO(List<CustomerBook> customerBooks);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "createdDate", target = "createdDate")
    @Mapping(source = "customerId", target = "customer.id")
    @Mapping(source = "bookId", target = "book.id")
    List<CustomerBook> bookDTOToBook(List<CustomerBookDTO> customerBookDTOS);
}

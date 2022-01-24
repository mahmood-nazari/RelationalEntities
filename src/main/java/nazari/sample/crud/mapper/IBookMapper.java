package nazari.sample.crud.mapper;

import nazari.sample.crud.model.datamodel.Book;
import nazari.sample.crud.model.datamodel.Car;
import nazari.sample.crud.model.dto.BookDTO;
import nazari.sample.crud.model.dto.CarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IBookMapper {
    IBookMapper INSTANCE = Mappers.getMapper(IBookMapper.class);

//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "bookName", target = "bookName")
//    @Mapping(source = "", target = "customerBookId")
    BookDTO bookToBookDTO(Book book);

//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "bookName", target = "bookName")
//    @Mapping(source = "customerBookId", target = "customerBooks")
    Book bookDTOToBook(BookDTO bookDTO);

//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "bookName", target = "bookName")
//    @Mapping(source = "customerBooks", target = "customerBookId")
    List<BookDTO> bookToBookDTO(List<Book> books);

//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "bookName", target = "bookName")
//    @Mapping(source = "customerBookId", target = "customerBooks")
    List<Book> bookDTOToBook(List<BookDTO> bookDTOS);

}

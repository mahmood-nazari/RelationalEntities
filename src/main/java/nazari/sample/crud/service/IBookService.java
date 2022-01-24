package nazari.sample.crud.service;

import nazari.sample.crud.model.datamodel.Book;
import nazari.sample.crud.model.dto.BookDTO;

import java.util.List;

public interface IBookService {

    Book saveOrUpdate(BookDTO bookDTO);

    BookDTO getById(Long id);

    List<BookDTO> getAllCar();

    void deleteById(Long id);
}

package nazari.sample.crud.service.impl;

import nazari.sample.crud.model.datamodel.Book;
import nazari.sample.crud.model.dto.BookDTO;
import nazari.sample.crud.repository.IBookDao;
import nazari.sample.crud.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookDao iBookDao;

    @Override
    public Book saveOrUpdate(BookDTO bookDTO) {
        return null;
    }

    @Override
    public BookDTO getById(Long id) {
        return null;
    }

    @Override
    public List<BookDTO> getAllCar() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

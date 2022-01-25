package nazari.sample.crud.service.impl;

import nazari.sample.crud.mapper.IBookMapper;
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
        Book book = IBookMapper.INSTANCE.bookDTOToBook(bookDTO);
        return iBookDao.save(book);
    }

    @Override
    public BookDTO getById(Long id) {
        return IBookMapper.INSTANCE.bookToBookDTO(iBookDao.findById(id).orElse(null));
    }

    @Override
    public List<BookDTO> getAllCar() {
        return IBookMapper.INSTANCE.bookToBookDTO(iBookDao.findAll());
    }

    @Override
    public void deleteById(Long id) {
        iBookDao.deleteById(id);
    }
}

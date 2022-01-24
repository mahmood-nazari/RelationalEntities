package nazari.sample.crud.controller;

import nazari.sample.crud.model.datamodel.Book;
import nazari.sample.crud.model.datamodel.Customer;
import nazari.sample.crud.model.dto.BookDTO;
import nazari.sample.crud.model.dto.CustomerDTO;
import nazari.sample.crud.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @PostMapping("save-or-update")
    public Book saveOrUpdate(@RequestBody BookDTO bookDTO) {
        return iBookService.saveOrUpdate(bookDTO);
    }

    @GetMapping("get-by-id/{id}")
    public BookDTO getById(@PathVariable Long id) {
        return iBookService.getById(id);
    }

    @GetMapping("get-all")
    public List<BookDTO> getAll() {
        return iBookService.getAllCar();
    }

    @DeleteMapping("delete-by-id/{id}")
    public void deleteById(@PathVariable Long id) {
        iBookService.deleteById(id);
    }
}

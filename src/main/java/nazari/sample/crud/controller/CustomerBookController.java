package nazari.sample.crud.controller;

import nazari.sample.crud.model.datamodel.Book;
import nazari.sample.crud.model.datamodel.CustomerBook;
import nazari.sample.crud.model.dto.BookDTO;
import nazari.sample.crud.model.dto.CustomerBookDTO;
import nazari.sample.crud.service.ICustomerBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer-book")
public class CustomerBookController {

    @Autowired
    private ICustomerBookService iCustomerBookService;

    @PostMapping("save-or-update")
    public CustomerBook saveOrUpdate(@RequestBody CustomerBookDTO customerBookDTO) {
        return iCustomerBookService.saveOrUpdate(customerBookDTO);
    }

    @GetMapping("get-by-id/{id}")
    public CustomerBookDTO getById(@PathVariable Long id) {
        return iCustomerBookService.getById(id);
    }

    @GetMapping("get-all")
    public List<CustomerBookDTO> getAll() {
        return iCustomerBookService.getAllCar();
    }

    @DeleteMapping("delete-by-id/{id}")
    public void deleteById(@PathVariable Long id) {
        iCustomerBookService.deleteById(id);
    }
}

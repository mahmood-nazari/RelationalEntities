package nazari.sample.crud.controller;

import nazari.sample.crud.model.datamodel.Car;
import nazari.sample.crud.model.datamodel.Customer;
import nazari.sample.crud.model.dto.CarDTO;
import nazari.sample.crud.model.dto.CustomerDTO;
import nazari.sample.crud.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @PostMapping("save-or-update")
    public Customer saveOrUpdate(@RequestBody CustomerDTO customerDTO) {
        return iCustomerService.saveOrUpdate(customerDTO);
    }

    @GetMapping("get-by-id/{id}")
    public CustomerDTO getById(@PathVariable Long id) {
        return iCustomerService.getById(id);
    }

    @GetMapping("get-all")
    public List<CustomerDTO> getAll() {
        return iCustomerService.getAllCar();
    }

    @DeleteMapping("delete-by-id/{id}")
    public void deleteById(@PathVariable Long id) {
        iCustomerService.deleteById(id);
    }
}

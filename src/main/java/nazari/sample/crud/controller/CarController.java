package nazari.sample.crud.controller;

import nazari.sample.crud.model.datamodel.Car;
import nazari.sample.crud.model.dto.CarDTO;
import nazari.sample.crud.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private ICarService iCarService;

    @PostMapping("save-or-update")
    public Car saveOrUpdate(@RequestBody CarDTO carDTO) {
        return iCarService.saveOrUpdate(carDTO);
    }

    @GetMapping("get-by-id/{id}")
    public CarDTO getById(@PathVariable Long id) {
        return iCarService.getById(id);
    }

    @GetMapping("get-all")
    public List<CarDTO> getAll() {
        return iCarService.getAllCar();
    }

    @DeleteMapping("delete-by-id/{id}")
    public void deleteById(@PathVariable Long id) {
        iCarService.deleteById(id);
    }
}

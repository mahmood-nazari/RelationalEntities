package nazari.sample.crud.controller;

import nazari.sample.crud.model.Car;
import nazari.sample.crud.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private ICarService iCarService;

    @PostMapping("save-or-update")
    public Car saveOrUpdate(@RequestBody Car car) {
        return iCarService.saveOrUpdate(car);
    }

    @GetMapping("get-by-id/{id}")
    public Car getById(@PathVariable Long id) {
        return iCarService.getById(id);
    }

    @GetMapping("get-all")
    public Iterable<Car> getAll() {
        return iCarService.getAllCar();
    }

    @DeleteMapping("delete-by-id/{id}")
    public void deleteById(@PathVariable Long id) {
        iCarService.deleteById(id);
    }
}

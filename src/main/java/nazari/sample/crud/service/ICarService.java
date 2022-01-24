package nazari.sample.crud.service;

import nazari.sample.crud.model.datamodel.Car;
import nazari.sample.crud.model.dto.CarDTO;

import java.util.List;

public interface ICarService {

    Car saveOrUpdate(CarDTO carDTO);

    CarDTO getById(Long id);

    List<CarDTO> getAllCar();

    void deleteById(Long id);
}

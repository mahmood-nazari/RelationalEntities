package nazari.sample.crud.service;

import nazari.sample.crud.model.Car;

public interface ICarService {

    Car save(Car car);

    Car getById(Long id);

    Iterable<Car> getAllCar();

    void deleteById(Long id);
}

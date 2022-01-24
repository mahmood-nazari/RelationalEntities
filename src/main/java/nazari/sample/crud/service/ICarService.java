package nazari.sample.crud.service;

import nazari.sample.crud.model.datamodel.Car;

public interface ICarService {

    Car saveOrUpdate(Car car);

    Car getById(Long id);

    Iterable<Car> getAllCar();

    void deleteById(Long id);
}

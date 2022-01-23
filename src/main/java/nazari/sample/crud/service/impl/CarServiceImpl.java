package nazari.sample.crud.service.impl;

import nazari.sample.crud.model.Car;
import nazari.sample.crud.repository.ICarDao;
import nazari.sample.crud.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    private ICarDao iCarDao;

    @Override
    @Transactional
    public Car save(Car car) {
        return iCarDao.save(car);
    }

    @Transactional
    @Override
    public Car getById(Long id) {
        return iCarDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public Iterable<Car> getAllCar() {
        return iCarDao.findAll();
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        iCarDao.deleteById(id);
    }
}

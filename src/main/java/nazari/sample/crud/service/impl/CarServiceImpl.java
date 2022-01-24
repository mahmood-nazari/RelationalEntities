package nazari.sample.crud.service.impl;

import nazari.sample.crud.mapper.ICarMapper;
import nazari.sample.crud.model.datamodel.Car;
import nazari.sample.crud.model.dto.CarDTO;
import nazari.sample.crud.repository.ICarDao;
import nazari.sample.crud.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    private ICarDao iCarDao;

    @Override
    @Transactional
    public Car saveOrUpdate(CarDTO carDTO) {
        Car car = ICarMapper.INSTANCE.carDTOToCar(carDTO);
        return iCarDao.save(car);
    }

    @Transactional
    @Override
    public CarDTO getById(Long id) {
        Car car = iCarDao.findById(id).orElse(null);
        return ICarMapper.INSTANCE.carToCarDTO(car);
    }

    @Transactional
    @Override
    public List<CarDTO> getAllCar() {
        List<Car> allCars = iCarDao.findAll();
        return ICarMapper.INSTANCE.carToCarDTO(allCars);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        iCarDao.deleteById(id);
    }
}

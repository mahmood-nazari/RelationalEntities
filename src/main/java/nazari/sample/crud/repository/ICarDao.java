package nazari.sample.crud.repository;

import nazari.sample.crud.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarDao extends CrudRepository<Car, Long> {
}

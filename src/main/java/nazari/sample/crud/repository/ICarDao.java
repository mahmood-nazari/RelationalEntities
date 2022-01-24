package nazari.sample.crud.repository;

import nazari.sample.crud.model.datamodel.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarDao extends JpaRepository<Car, Long> {
}

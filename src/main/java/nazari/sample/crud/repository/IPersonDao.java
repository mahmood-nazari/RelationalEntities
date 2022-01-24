package nazari.sample.crud.repository;

import nazari.sample.crud.model.datamodel.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonDao extends JpaRepository<Person, Long> {
}

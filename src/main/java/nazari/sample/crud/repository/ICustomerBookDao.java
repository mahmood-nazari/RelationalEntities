package nazari.sample.crud.repository;

import nazari.sample.crud.model.datamodel.CustomerBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerBookDao extends JpaRepository<CustomerBook, Long> {
}

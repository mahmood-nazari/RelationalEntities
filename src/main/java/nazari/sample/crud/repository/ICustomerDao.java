package nazari.sample.crud.repository;

import nazari.sample.crud.model.datamodel.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerDao extends JpaRepository<Customer, Long> {
}

package nazari.sample.crud.repository;

import nazari.sample.crud.model.datamodel.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookDao extends JpaRepository<Book, Long> {
}

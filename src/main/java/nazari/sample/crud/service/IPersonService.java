package nazari.sample.crud.service;

import nazari.sample.crud.model.datamodel.Person;
import nazari.sample.crud.model.dto.PersonDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IPersonService {

    Person saveOrUpdate(PersonDTO personDTO);

    PersonDTO getById(Long id);

    List<PersonDTO> getAllPerson();

    void deleteById(Long id);
}

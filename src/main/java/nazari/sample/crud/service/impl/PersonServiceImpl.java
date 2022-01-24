package nazari.sample.crud.service.impl;

import nazari.sample.crud.mapper.IPersonMapper;
import nazari.sample.crud.model.datamodel.Person;
import nazari.sample.crud.model.dto.PersonDTO;
import nazari.sample.crud.repository.IPersonDao;
import nazari.sample.crud.service.IPersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonDao iPersonDao;

    public PersonServiceImpl(IPersonDao iPersonDao) {
        this.iPersonDao = iPersonDao;
    }

    @Override
    public Person saveOrUpdate(PersonDTO personDTO) {
        Person person = IPersonMapper.INSTANCE.personDTOToPerson(personDTO);
        return iPersonDao.save(person);
    }

    @Override
    public PersonDTO getById(Long id) {
        Person person = iPersonDao.findById(id).orElse(null);
        return IPersonMapper.INSTANCE.personToPersonDTO(person);
    }

    @Override
    public List<PersonDTO> getAllPerson() {
        List<Person> all = iPersonDao.findAll();
        return IPersonMapper.INSTANCE.personToPersonDTO(all);
    }

    @Override
    public void deleteById(Long id) {
        iPersonDao.deleteById(id);
    }
}

package nazari.sample.crud.service.impl;

import nazari.sample.crud.mapper.IPersonMapper;
import nazari.sample.crud.model.datamodel.Person;
import nazari.sample.crud.model.dto.PersonDTO;
import nazari.sample.crud.repository.IPersonDao;
import nazari.sample.crud.service.IPersonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonDao iPersonDao;

    public PersonServiceImpl(IPersonDao iPersonDao) {
        this.iPersonDao = iPersonDao;
    }

    @Override
    @Transactional
    public Person saveOrUpdate(PersonDTO personDTO) {
        Person person = IPersonMapper.INSTANCE.personDTOToPerson(personDTO);
        validationForPreventSaveCarBecauseMappingInPersonSave(person);
        validationForSetCarNameInPersonObjectWhenCarSaveInPerson(person, personDTO);
        return iPersonDao.save(person);
    }

    private void validationForSetCarNameInPersonObjectWhenCarSaveInPerson(Person person, PersonDTO personDTO) {
        if (person.getCar() != null && person.getId() != null)
            person.getCar().setCarName(personDTO.getCarName());
    }

    /*
     * when try to save a person without car, because of mapping null carId map to car.id and it will save to Database with null values except id
     * this line make car object null to prevent save it
     * */
    private void validationForPreventSaveCarBecauseMappingInPersonSave(Person person) {
        if (person.getCar().getId() == null)
            person.setCar(null);
    }

    @Override
    @Transactional
    public PersonDTO getById(Long id) {
        Person person = iPersonDao.findById(id).orElse(null);
        return IPersonMapper.INSTANCE.personToPersonDTO(person);
    }

    @Override
    @Transactional
    public List<PersonDTO> getAllPerson() {
        List<Person> all = iPersonDao.findAll();
        return IPersonMapper.INSTANCE.personToPersonDTO(all);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        iPersonDao.deleteById(id);
    }
}

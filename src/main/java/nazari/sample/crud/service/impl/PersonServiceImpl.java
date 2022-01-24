package nazari.sample.crud.service.impl;

import nazari.sample.crud.model.datamodel.Person;
import nazari.sample.crud.repository.IPersonDao;
import nazari.sample.crud.service.IPersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonDao iPersonDao;

    public PersonServiceImpl(IPersonDao iPersonDao) {
        this.iPersonDao = iPersonDao;
    }

    @Override
    public Person saveOrUpdate(Person person) {
        return iPersonDao.save(person);

    }

    @Override
    public Person getById(Long id) {
        return iPersonDao.findById(id).orElse(null);
    }

    @Override
    public Iterable<Person> getAllPerson() {
        return iPersonDao.findAll();
    }

    @Override
    public void deleteById(Long id) {
        iPersonDao.deleteById(id);
    }
}

package nazari.sample.crud.mapper;

import nazari.sample.crud.model.datamodel.Person;
import nazari.sample.crud.model.dto.CarDTO;
import nazari.sample.crud.model.dto.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = CarDTO.class)
public interface IPersonMapper {
    IPersonMapper INSTANCE = Mappers.getMapper(IPersonMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastname", target = "lastname")
    @Mapping(source = "car.id", target = "carId")
    PersonDTO personToPersonDTO(Person person);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastname", target = "lastname")
    @Mapping(source = "carId", target = "car.id")
    Person personDTOToPerson(PersonDTO personDTO);



    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastname", target = "lastname")
    @Mapping(source = "car.id", target = "carId")
    List<PersonDTO> personToPersonDTO(List<Person> person);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastname", target = "lastname")
    @Mapping(source = "carId", target = "car.id")
    List<Person> personDTOToPerson(List<PersonDTO> personDTO);

}

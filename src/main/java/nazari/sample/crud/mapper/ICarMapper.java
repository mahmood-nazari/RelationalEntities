package nazari.sample.crud.mapper;

import nazari.sample.crud.model.datamodel.Car;
import nazari.sample.crud.model.dto.CarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ICarMapper {
    ICarMapper INSTANCE = Mappers.getMapper(ICarMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "carName", target = "carName")
    CarDTO carToCarDTO(Car car);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "carName", target = "carName")
    Car carDTOToCar(CarDTO carDTO);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "carName", target = "carName")
    List<CarDTO> carToCarDTO(List<Car> car);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "carName", target = "carName")
    List<Car> carDTOToCar(List<CarDTO> carDTO);

}

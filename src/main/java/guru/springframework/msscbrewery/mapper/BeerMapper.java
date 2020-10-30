package guru.springframework.msscbrewery.mapper;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    public Beer beerDtoToBeer(BeerDto dto);
    public BeerDto beerToBeerDto(Beer beer);

}

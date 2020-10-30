package guru.springframework.msscbrewery.mapper;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import org.mapstruct.Mapper;

@Mapper
public interface BeerV2Mapper {

    public Beer beerDtoToBeer(BeerDtoV2 dto);
    public BeerDtoV2 beerToBeerDto(Beer beer);

}

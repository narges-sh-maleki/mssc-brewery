package guru.springframework.msscbrewery.web.model;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BeerDtoTest {

    @Test
    void builder() {
        BeerDto.builder().beerName("wine").build();
    }


    @Test
    @Disabled
    void testComparator() {
        List<BeerDto> list = new ArrayList<>() ;
        list.add(new BeerDto());
        list.add(new BeerDto());
        //list.sort(BeerDto::compareTo);
        list.sort((o1,o2)->{
          return o1.getBeerName().compareTo(o2.getBeerName());
        });

        list.sort(new Comparator<BeerDto>() {
            @Override
            public int compare(BeerDto o1, BeerDto o2) {
                return 0;
            }
        });


        list.sort(Comparator.comparing(BeerDto::getBeerName).thenComparing(BeerDto::getId));
    }
}
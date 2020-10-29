package guru.springframework.msscbrewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDtoV2 {

    @Null
    private UUID id;

    @Pattern(regexp = "[a-zA-Z]*")
    private String beerName;

    private BeerStyleEnum beerStyle;

    @Min(2L)
    private Long upc;


}

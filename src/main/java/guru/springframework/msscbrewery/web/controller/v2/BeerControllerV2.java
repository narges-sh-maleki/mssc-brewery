package guru.springframework.msscbrewery.web.controller.v2;


import guru.springframework.msscbrewery.service.v2.BeerServiceV2;
import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    public BeerControllerV2(BeerServiceV2 beerService) {
        this.beerService = beerService;
    }


    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<BeerDtoV2>(beerService.getBeerById(beerId), HttpStatus.OK);
    }


    //todo : add host to URL
    @PostMapping
    public ResponseEntity<BeerDtoV2> handlePost(@RequestBody  BeerDtoV2 beerDto){
        BeerDtoV2 savedDto =  beerService.saveNewBeer(beerDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location","/api/v1/beer/" + savedDto.getId().toString());
        return new ResponseEntity<>(httpHeaders,HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> handlePut(@PathVariable UUID beerId,@RequestBody BeerDtoV2 beerDto){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location","/api/v1/beer/" + beerId.toString());
        return new ResponseEntity<BeerDtoV2>(beerService.updateBeer(beerId,beerDto),httpHeaders,HttpStatus.OK);


    }
    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId){
        beerService.deleteBeer( beerId);
    }
}


package com.wulghash.microservices.beerbrewery.services;

import com.wulghash.microservices.beerbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Spaten")
                .beerStyle("Light")
                .upc(271065L).build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // toDo later implemention
    }

    @Override
    public void deleteBeer(UUID beerId) {
        //TODO later implementation
    }


}

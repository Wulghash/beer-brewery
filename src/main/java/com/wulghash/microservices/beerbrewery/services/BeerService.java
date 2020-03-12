package com.wulghash.microservices.beerbrewery.services;

import com.wulghash.microservices.beerbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);
}

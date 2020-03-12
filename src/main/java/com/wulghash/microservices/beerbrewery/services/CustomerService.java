package com.wulghash.microservices.beerbrewery.services;

import com.wulghash.microservices.beerbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

   CustomerDto getCustomerById(UUID id);
}

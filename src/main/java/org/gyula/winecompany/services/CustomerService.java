package org.gyula.winecompany.services;

import org.gyula.winecompany.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);
}

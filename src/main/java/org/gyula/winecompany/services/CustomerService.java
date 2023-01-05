package org.gyula.winecompany.services;

import org.gyula.winecompany.web.model.CustomerDTO;
import org.gyula.winecompany.web.model.WineDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO saveNewCustomer(CustomerDTO customerDTO);

    void updateCustomer(UUID customerId, CustomerDTO customerDTO);

    void deleteCustomer(UUID customerId);
}

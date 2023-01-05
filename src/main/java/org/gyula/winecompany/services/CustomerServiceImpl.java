package org.gyula.winecompany.services;

import lombok.extern.slf4j.Slf4j;
import org.gyula.winecompany.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .customerName("John Doe")
                .build();
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customerDTO) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customerDTO) {
        //todo - the update method doesn't exist yet
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting a customer here");
    }
}

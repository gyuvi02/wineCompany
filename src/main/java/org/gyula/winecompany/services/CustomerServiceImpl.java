package org.gyula.winecompany.services;

import org.gyula.winecompany.web.model.CustomerDTO;
import org.gyula.winecompany.web.model.WineDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .customerName("John Doe")
                .build();
    }
}

package org.gyula.winecompany.web.controller;

import org.gyula.winecompany.services.CustomerService;
import org.gyula.winecompany.web.model.CustomerDTO;
import org.gyula.winecompany.web.model.WineDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CustomerDTO customerDTO) {
        CustomerDTO savedDto = customerService.saveNewCustomer(customerDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer " + savedDto.getId().toString());
        return new  ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    public ResponseEntity handleupdate(@PathVariable ("customerId") UUID customerId, @RequestBody CustomerDTO customerDTO) {
        customerService.updateCustomer(customerId, customerDTO);
        return new  ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteWine(@PathVariable ("customerId") UUID customerId) {
        customerService.deleteCustomer(customerId);
    }

}

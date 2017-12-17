package com.infosupport.minor.springboothateoasexample.controller;

import com.infosupport.minor.springboothateoasexample.domain.Customer;
import com.infosupport.minor.springboothateoasexample.exception.CustomerNotFoundException;
import com.infosupport.minor.springboothateoasexample.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> get(@PathVariable Long id) {
        return this.customerRepository.findById(id).map(ResponseEntity::ok)
                .orElseThrow(() -> new CustomerNotFoundException(id));
    }
}

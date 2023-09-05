package com.lecubearoulettes.controller;

import com.lecubearoulettes.entity.Address;
import com.lecubearoulettes.entity.Customer;
import com.lecubearoulettes.entity.Role;
import com.lecubearoulettes.entity.Title;
import com.lecubearoulettes.entity.dto.CustomerDto;
import com.lecubearoulettes.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    CustomerService customerService;

    // ResponseEntity apporte des informations complémentaires en cas d'erreurs
    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> findAllCustomers() {
        List<Customer> allCustomers = customerService.findAllCustomers();
        return new ResponseEntity<>(allCustomers, HttpStatus.OK);
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable Long id){
        Customer customer = customerService.findCustomerById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

//    @PostMapping("/customers")
//    public Customer createCustomer(@RequestBody CustomerDto customerDto){
//        return customerService.createCustomer(customerDto);
//    }

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
}

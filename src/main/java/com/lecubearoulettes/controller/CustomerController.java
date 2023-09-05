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
//@RequestMapping("api/customers")
public class CustomerController {

    CustomerService customerService;

//    @GetMapping("customers")
//    public ResponseEntity<List<Customer>> findAllCustomers() {
//        List<Customer> allCustomers = customerService.findAllCustomers();
//        return new ResponseEntity<>(allCustomers, HttpStatus.OK);
//    }

    @GetMapping("customers")
    public List<Customer> findAllCustomers() {
        return customerService.findAllCustomers();
    }

    @GetMapping("customers/{id}")
    public Customer findCustomerById(Long id){
        return customerService.findCustomerById(id);
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

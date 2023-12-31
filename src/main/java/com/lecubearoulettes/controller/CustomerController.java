//package com.lecubearoulettes.controller;
//import com.lecubearoulettes.entity.Customer;
//import com.lecubearoulettes.entity.dto.CustomerDto;
//import com.lecubearoulettes.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//
//@RestController
//public class CustomerController {
//
//    CustomerService customerService;
//
//    // ResponseEntity apporte des informations complémentaires en cas d'erreurs
//    @GetMapping("/customers")
//    public ResponseEntity<List<Customer>> findAllCustomers() {
//        List<Customer> allCustomers = customerService.findAllCustomers();
//        return new ResponseEntity<>(allCustomers, HttpStatus.OK);
//    }
//
//    @GetMapping("/customers/{id}")
//    public ResponseEntity<Customer> findCustomerById(@PathVariable Long id){
//        Customer customer = customerService.findCustomerById(id);
//        return new ResponseEntity<>(customer, HttpStatus.OK);
//    }
//
//    @PostMapping("/customers/dto")
//    public ResponseEntity<Customer> createCustomerWithDto(@RequestBody CustomerDto customerDto){
//        Customer createdProduct = customerService.createCustomerWithDto(customerDto);
//        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
//    }
//
//    @PostMapping("/customers")
//    public ResponseEntity<Customer> createCustomerWithJson(@RequestBody Customer customerJson){
//        Customer createdCustomer = customerService.createCustomerWithJSon(customerJson);
//        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
//    }
//
//    @DeleteMapping("/customers/{id}")
//    public ResponseEntity<Customer> deleteCustomerById(@PathVariable Long id){
//        Customer customer = customerService.deleteCustomer(id);
//        return new ResponseEntity<>(customer, HttpStatus.OK);
//    }
//
//    @PutMapping("/customers")
//    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customerJson){
//        Customer updatedCustomer = customerService.updateCustomer(customerJson);
//        return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
//    }
//
//    @PutMapping("customers/{customerId}")
//    public ResponseEntity<Customer> updateCustomerById(@PathVariable("customerId") Long id, @RequestBody Customer customerJson){
//        customerJson.setId(id);
//        Customer updatedCustomer = customerService.updateCustomer(customerJson);
//        return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
//    }
//
//    // Injection par Setter du service = implémentation du Service qui est à la base une interface.
//    @Autowired
//    public void setCustomerService(CustomerService customerService) {
//        this.customerService = customerService;
//    }
//}

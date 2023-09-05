package com.lecubearoulettes.service;

import com.lecubearoulettes.entity.Customer;
import com.lecubearoulettes.entity.Role;
import com.lecubearoulettes.entity.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();
    Customer findCustomerById(Long id);

//    Customer createCustomer(CustomerDto customerDto);
}

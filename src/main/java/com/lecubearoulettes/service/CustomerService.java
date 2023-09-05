package com.lecubearoulettes.service;

import com.lecubearoulettes.entity.Customer;
import com.lecubearoulettes.entity.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();
    Customer findCustomerById(Long id);
    Customer createCustomerWithDto(CustomerDto customerDto);
    Customer createCustomerWithJSon(Customer customerJson);
    Customer deleteCustomer(Long id);
    Customer updateCustomer(Customer customerJson);

}

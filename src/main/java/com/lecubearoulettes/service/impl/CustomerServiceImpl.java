package com.lecubearoulettes.service.impl;

import com.lecubearoulettes.entity.Address;
import com.lecubearoulettes.entity.Customer;
import com.lecubearoulettes.entity.Role;
import com.lecubearoulettes.entity.Title;
import com.lecubearoulettes.entity.dto.CustomerDto;
import com.lecubearoulettes.exception.CustomerException;
import com.lecubearoulettes.repository.CustomerDao;
import com.lecubearoulettes.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    @Override
    public List<Customer> findAllCustomers() {
        List<Customer> allCustomers = customerDao.findAll();
        return allCustomers;
    }

    @Override
    public Customer findCustomerById(Long id) {
        Optional<Customer> optional = customerDao.findById(id);
        if(optional.isPresent()) return optional.get();
        else throw new CustomerException("Customer not found with given Id: " + id);
    }

//    @Override
//    public Customer createCustomer(CustomerDto customerDto) {
//        Address address = new Address(customerDto.getStreetNumber(),
//                customerDto.getStreetType(),
//                customerDto.getStreetName(),
//                customerDto.getAddressMoreInfo(),
//                customerDto.getZipCode(),
//                customerDto.getCity());
//        Customer customer = new Customer(customerDto.getFirstName(),
//                customerDto.getLastName(),
//                customerDto.getTitle(),
//                customerDto.getEmail(),
//                customerDto.getPhone(),
//                customerDto.getBirthdate(),
//                address,
//                customerDto.getRole());
//        customer = customerDao.save(customer);
//        return customer;
//    }

    @Autowired
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

}

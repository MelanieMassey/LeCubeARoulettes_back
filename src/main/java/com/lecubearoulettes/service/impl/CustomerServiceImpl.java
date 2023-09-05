package com.lecubearoulettes.service.impl;

import com.lecubearoulettes.entity.Address;
import com.lecubearoulettes.entity.Customer;
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

    @Override
    public Customer createCustomerWithDto(CustomerDto customerDto) {
        Address address = new Address(customerDto.getStreetNumber(),
                customerDto.getStreetType(),
                customerDto.getStreetName(),
                customerDto.getAddressMoreInfo(),
                customerDto.getZipCode(),
                customerDto.getCity());
        Customer customer = new Customer(customerDto.getFirstName(),
                customerDto.getLastName(),
                customerDto.getTitle(),
                customerDto.getEmail(),
                customerDto.getPhone(),
                customerDto.getBirthdate(),
                address,
                customerDto.getRole());
        customer = customerDao.save(customer);
        return customer;
    }

    @Override
    public Customer createCustomerWithJSon(Customer customerJson) {
        Customer createdCustomer = customerDao.save(customerJson);
        return createdCustomer;
    }

    @Override
    public Customer deleteCustomer(Long id) {
        Optional<Customer> optionalCustomer = customerDao.findById(id);

        if (optionalCustomer.isPresent()){
            Customer customer = optionalCustomer.get();
            customerDao.delete(customer);
            return customer;
        }
        else throw new CustomerException("Customer not found for this id: " + id);
    }

    @Override
    public Customer updateCustomer(Customer customerJson) {
        Customer existingCustomer = customerDao.findById(customerJson.getId()).orElseThrow( () -> new CustomerException("Customer not found for this id: " + customerJson.getId()));

        // Si existingCustomer, alors pas d'exception renvoyée donc le code continue
        Customer updatedCustomer = customerDao.save(customerJson);

        return updatedCustomer;
    }

    // SETTER DAO - injection
    @Autowired
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

}

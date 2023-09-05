package com.lecubearoulettes.repository;

import com.lecubearoulettes.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerDao extends JpaRepository<Customer, Long> {

//    public List<Customer> findBylastName(String lastName);
}

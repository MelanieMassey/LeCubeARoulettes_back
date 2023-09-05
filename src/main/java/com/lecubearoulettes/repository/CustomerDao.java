package com.lecubearoulettes.repository;

import com.lecubearoulettes.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Long> {

}

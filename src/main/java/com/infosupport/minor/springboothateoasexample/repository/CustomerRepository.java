package com.infosupport.minor.springboothateoasexample.repository;

import com.infosupport.minor.springboothateoasexample.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}

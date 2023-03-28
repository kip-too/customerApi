package com.kiptoo.customer.repo;

import com.kiptoo.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
 List<Customer> findByLatNameStartWithIgnoreCase(String lastName);
}
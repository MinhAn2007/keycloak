package org.example.keycloakdemo.dao;


import org.example.keycloakdemo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<Customer, Long> {

}

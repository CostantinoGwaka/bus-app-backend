package com.example.busreservation.repository;

import com.example.busreservation.entities.BusRoute;
import com.example.busreservation.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

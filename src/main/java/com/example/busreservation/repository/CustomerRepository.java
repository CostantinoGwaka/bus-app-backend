package com.example.busreservation.repository;

import com.example.busreservation.entities.BusRoute;
import com.example.busreservation.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByMobileOrEmail(String mobile, String email);

    Optional<Customer> findByMobile(String mobile);
    Optional<Customer> findByEmail(String email);

    Boolean existsByMobile(String mobile);
    Boolean existsByEmail(String email);

    Boolean existsByMobileOrEmail(String mobile,String email);
}

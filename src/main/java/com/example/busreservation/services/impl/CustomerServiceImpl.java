package com.example.busreservation.services.impl;

import com.example.busreservation.entities.Bus;
import com.example.busreservation.entities.Customer;
import com.example.busreservation.repository.BusRepository;
import com.example.busreservation.repository.CustomerRepository;
import com.example.busreservation.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer registerCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllRegisteredCustomer() {
        return customerRepository.findAll();
    }

}

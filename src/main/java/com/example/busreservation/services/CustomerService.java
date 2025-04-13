package com.example.busreservation.services;

import com.example.busreservation.entities.BusRoute;
import com.example.busreservation.entities.Customer;

import java.util.List;


public interface CustomerService {

    Customer registerCustomer(Customer customer);

    List<Customer> getAllRegisteredCustomer();
}

package com.example.busreservation.controller;


import com.example.busreservation.entities.BusRoute;
import com.example.busreservation.entities.Customer;
import com.example.busreservation.models.ResponseModel;
import com.example.busreservation.services.BusRouteService;
import com.example.busreservation.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public ResponseModel<Customer> registerCustomer(@RequestBody Customer customer){
        final Customer savedCustomer = customerService.registerCustomer(customer);
        return new ResponseModel<>(HttpStatus.OK.value(), "customer successfully saved",savedCustomer);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllRegisteredCustomer(){
        return ResponseEntity.ok(customerService.getAllRegisteredCustomer());
    }
}

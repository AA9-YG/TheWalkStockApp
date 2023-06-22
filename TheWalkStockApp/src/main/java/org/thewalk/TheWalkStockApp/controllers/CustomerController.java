package org.thewalk.TheWalkStockApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thewalk.TheWalkStockApp.entities.Customer;
import org.thewalk.TheWalkStockApp.services.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService custService;

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id) {
        return new ResponseEntity<>(custService.findCustomerById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return new ResponseEntity<>(custService.findAllCustomers(), HttpStatus.OK);
    }

}

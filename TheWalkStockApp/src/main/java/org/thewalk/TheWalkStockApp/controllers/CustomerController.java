package org.thewalk.TheWalkStockApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thewalk.TheWalkStockApp.entities.Customer;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {

    }

}

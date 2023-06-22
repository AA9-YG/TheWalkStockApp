package org.thewalk.TheWalkStockApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thewalk.TheWalkStockApp.daos.CustomerDAO;
import org.thewalk.TheWalkStockApp.entities.Customer;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO custDAO;

    public Customer findCustomerById(Long id) {
        Optional<Customer> customer = custDAO.findById(id);

        if (customer.isPresent()) {
            return customer.get();
        } else
            return new Customer();
    }
}

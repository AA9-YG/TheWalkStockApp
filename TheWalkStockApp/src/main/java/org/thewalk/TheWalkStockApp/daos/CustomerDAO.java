package org.thewalk.TheWalkStockApp.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thewalk.TheWalkStockApp.entities.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Long, Customer> {

}

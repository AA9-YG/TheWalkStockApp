package org.thewalk.TheWalkStockApp.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUST_ID")
    private Long customerID;

    @Column(name = "CUST_NAME")
    private String name;

    @Column(name = "CUST_EMAIL")
    private String email;


    public Customer() {
    }

    public Customer(Long customerID, String name, String email) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
    }

//    public Long getCustomerID() {
//        return customerID;
//    }
//
//    public void setCustomerID(Long customerID) {
//        this.customerID = customerID;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

}

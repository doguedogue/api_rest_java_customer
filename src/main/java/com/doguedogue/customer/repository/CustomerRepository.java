/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doguedogue.customer.repository;

import com.doguedogue.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rvilches
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}

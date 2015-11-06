/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filipferm.soap.ejb;

import com.filipferm.soap.model.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Filip
 */
@Stateless
public class CustomerManager {

    @PersistenceContext(name = "IntegratioSoapPU")
    EntityManager em;

    public List<Customer> getAllCustomers() {
        return em.createNamedQuery("Customer.findAll", Customer.class).getResultList();
    }

    public Customer getCustomerByFirstName(int customerId) {
        return em.find(Customer.class, customerId);
    }

    public boolean addCustomer(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            return false;
        } else {
            Customer customer = new Customer();
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            em.merge(customer);
        }
        return true;
    }
}

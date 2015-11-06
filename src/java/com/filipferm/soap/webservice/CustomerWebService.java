/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filipferm.soap.webservice;

import com.filipferm.soap.ejb.CustomerManager;
import com.filipferm.soap.model.Customer;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author Filip
 */
@WebService(endpointInterface = "com.filipferm.soap.webservice.CustomerWebServiceInterface",
        serviceName = "CustomerService",
        portName = "CustomerPort")  //to change names in wbsl so its easier to see
public class CustomerWebService implements CustomerWebServiceInterface {

    @EJB
    CustomerManager cm;

    @Override
    public boolean addCustomer(String firstName, String lastName) {
        return cm.addCustomer(firstName, lastName);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return cm.getAllCustomers();
    }

    @Override
    public Customer getCustomerById(int customerId) {
        return cm.getCustomerByFirstName(customerId);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filipferm.soap.webservice;

import com.filipferm.soap.model.Customer;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Filip
 */
@WebService(name = "CustomerWebService",
        targetNamespace = "http://www.integrationSoap.com")
public interface CustomerWebServiceInterface {

    @WebMethod
    boolean addCustomer(String firstName, String lastName);

    @WebMethod
    List<Customer> getAllCustomers();

    @WebMethod
    Customer getCustomerById(int customerId);
}

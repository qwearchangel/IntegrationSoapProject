package com.filipferm.soap.model;

import com.filipferm.soap.model.Customer;
import com.filipferm.soap.model.Orderitems;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-28T13:46:15")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile CollectionAttribute<Orders, Orderitems> orderitemsCollection;
    public static volatile SingularAttribute<Orders, Customer> customerid;
    public static volatile SingularAttribute<Orders, Integer> id;
    public static volatile SingularAttribute<Orders, String> message;
    public static volatile SingularAttribute<Orders, Date> orderDate;

}
package com.filipferm.soap.model;

import com.filipferm.soap.model.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-28T13:46:15")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile CollectionAttribute<Category, Product> productCollection;
    public static volatile SingularAttribute<Category, String> description;
    public static volatile SingularAttribute<Category, Integer> id;
    public static volatile SingularAttribute<Category, String> categoryName;

}
package com.mohammad.shopping.service;

import com.mohammad.shopping.model.Product;
import jakarta.transaction.Transactional;
import org.springframework.transaction.annotation.Propagation;

/*
The @Transactional annotation is used to mark a method or a class as transactional,
meaning that any database operations performed within the marked method or class will
be executed within a transaction.
*/

public class TransactionalService {

    @Transactional
    public Product addProduct(Product product) throws Exception {
       //This method will have transactional behaviour
        return null;
    }
}